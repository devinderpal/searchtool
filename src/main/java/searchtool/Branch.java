package searchtool;

public class Branch {
    public enum BranchType{
        Branch,
        ATM
    }
    private String bankName;
    private BranchType type;
    private String city;
    private String state;
    private String zipcode;

    public Branch(String bankName, BranchType type, String city, String state, String zipcode) {
        this.bankName = bankName;
        this.type = type;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Branch[" +
                "bankName='" + bankName + '\'' +
                ", type=" + type +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ']';
    }

    public String toSearchString(){
        String cityState = String.format("%s,%s", city, state);
        return String.format("%s %s %s %s %s %s", bankName, type, city, state, zipcode, cityState);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BranchType getType() {
        return type;
    }

    public void setType(BranchType type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
