public class Person {

    private String firstName;
    private String lastName;
    private int index;

    public Person() {
    }

    public Person(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d", getFirstName(), getLastName(), getIndex());
    }
}
