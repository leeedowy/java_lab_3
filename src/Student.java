public class Student {

    private Person person;
    private FacultyEnum faculty;

    public Student() {
    }

    public Student(Person person, FacultyEnum faculty) {
        this.person = person;
        this.faculty = faculty;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public FacultyEnum getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyEnum faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return String.format("%s - Faculty of %s", person.toString(), faculty.toString());
    }
}
