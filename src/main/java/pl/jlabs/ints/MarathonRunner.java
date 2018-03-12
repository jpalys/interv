package pl.jlabs.ints;


public class MarathonRunner {
    private String firstName;
    private String lastName;
    private Integer startNumber;

    public MarathonRunner(String firstName, String lastName, int startNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startNumber = startNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getStartNumber() {
        return startNumber;
    }


    @Override
    public String toString() {
        return "MarathonRunner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", startNumber=" + startNumber +
                '}';
    }

}
