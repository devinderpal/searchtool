package searchtool;

import java.util.List;
import java.util.stream.Collectors;

public class BranchSearcher {
    private final List<Branch> branches;

    public BranchSearcher(List<Branch> branches){
        this.branches = branches;
    }

    public List<Branch> searchBranch(String searchBy){
        return branches.stream()
                .filter(b -> b.toSearchString().toLowerCase().contains(searchBy.toLowerCase())) //ignore case search
                .collect(Collectors.toList());
    }
}
