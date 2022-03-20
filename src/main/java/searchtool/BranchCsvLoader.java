package searchtool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import searchtool.exception.SearchToolException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BranchCsvLoader {
    private static final String COMMA_DELIMITER = ",";
    private static final Logger LOG = LoggerFactory.getLogger(BranchCsvLoader.class);

    public List<Branch> loadData(){
        List<Branch> branches = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/main/resources/ProgrammingAssignment.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("ID,")){
                    continue;//header
                }
                String[] values = line.split(COMMA_DELIMITER);
                if (values.length != 6){
                    LOG.warn("Invalid line: {}, skipping", line);
                    continue;
                }
                // index 0 is running number, so skip it
                branches.add(new Branch(values[1], Branch.BranchType.valueOf(values[2]), values[3], values[4],
                        values[5]));
            }
            LOG.info("Branched loaded successfully. Count: {}", branches.size());
            return branches;
        } catch (IOException e) {
            throw new SearchToolException("Error parsing branches data", e);
        }
    }
}
