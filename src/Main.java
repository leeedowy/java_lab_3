import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Point pointA = new Point(5);
        System.out.println(pointA); // metoda toString() zostaje wywoływana implicytnie w metodzie println

        pointA = new Point(3, 9, 5);
        System.out.println(pointA); // metoda toString() zostaje wywoływana implicytnie w metodzie println

        pointA.setpX(52);
        pointA.setpY(-42);
        pointA.setpZ(17);
        System.out.println(pointA); // metoda toString() zostaje wywoływana implicytnie w metodzie println

        System.out.println(pointA.getpX());
        System.out.println(pointA.getpY());
        System.out.println(pointA.getpZ());

        System.out.println(pointA.sum());
        System.out.println(pointA.difference());
        System.out.println(pointA.difference(-2, 4, 3));
    }
}
