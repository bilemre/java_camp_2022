public class Person extends Customer {
    String nationalIdentity;
    public String firstName;
    public String lastName;
    public String getNationalIdentity() {
        return nationalIdentity;
    }
    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
