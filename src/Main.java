import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student student1 = new Student();
        student1.firstName = "Patryk";
        student1.lastName = "Zieliński";
        student1.age = 29;
        student1.active = true;

        Student student2 = new Student();
        student2.firstName = "Jan";
        student2.lastName = "Kowalski";
        student2.age = 21;
        student2.active = true;

        Student student3 = new Student();
        student3.firstName = "Robert";
        student3.lastName = "Mugabe";
        student3.age = 37;
        student3.active = false;

        Student [] students = {student1, student2, student3};
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
