# Branch Search Tool

## Build
`./gradlew build`

## Run
You can run the jar directly using the below command:

`java -jar build/libs/searchtool.jar`

You can enter any of the Zip code, State, City, Type, Bank Name or City & State to peform the search.
It prints the matching branches on the console

### Sample Run
The data is automatically loaded on the program start. So you directly enter your search criteria. 

To change the CSV file, copy the new file to the `src/main/resources/ProgrammingAssignment.csv`
```
bash-3.2$ java -jar build/libs/searchtool.jar 
Please enter your search criteria, Accepted Zip code, State, City, Type, Bank Name or City & State:
Amazing
User input: Amazing
Branch[bankName='Amazing Bank', type=Branch, city='New York', state='NY', zipcode='10018']
Branch[bankName='Amazing Bank', type=ATM, city='New York', state='NY', zipcode='10018']
Branch[bankName='Amazing Bank', type=ATM, city='Winston-Salem', state='NC', zipcode='27106']
Branch[bankName='Amazing Bank', type=ATM, city='Dallas', state='TX', zipcode='75202']

```

##Unit & integration tests

### Unit tests
Automated tests can be added to the `src/test/java/searchtool` dir. Unit test should be added for BranchSearcher, and BranchCsvLoader class to make sure their functionality works as exected.
Mockito is a great tool to mock some aspects of the unit tests

### Integration tests
For integration tests, have `BranchCsvLoader.loadData` return different combination of data and then validate the results.

