public class Student {

    public String firstName;
    public String lastName;
    public int age;
    public boolean active;

    @Override
    public String toString() {
        return String.format("%s %s, %d: %s", firstName, lastName, age, active ? "aktywny" : "nieaktywny");
    }
}
