import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        List<Student> students = new ArrayList<>();
        
        Person person1 = new Person("Beth", "Harmon", 295853);
        Student student1 = new Student(person1, FacultyEnum.ARTS);
        students.add(student1);
        
        Person person2 = new Person("Kamil", "Nawrocki", 757452);
        Student student2 = new Student(person2, FacultyEnum.COMMERCE);
        students.add(student2);
        
        Person person3 = new Person("Krystian", "Bębenek", 965264);
        Student student3 = new Student(person3, FacultyEnum.INFORMATION_TECHNOLOGY);
        students.add(student3);
        
        Person person4 = new Person("Christian", "White", 457621);
        Student student4 = new Student(person4, FacultyEnum.MANAGEMENT_STUDIES);
        students.add(student4);
        
        Person person5 = new Person("Adam", "Hofmann", 116366);
        Student student5 = new Student(person5, FacultyEnum.LAW);
        students.add(student5);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
