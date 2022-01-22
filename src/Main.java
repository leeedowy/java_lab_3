public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Horse horse = new Horse("wheet");
        horse.setPlanet("Earth");
        horse.setLifeSpan(3000);
        horse.setType("mammal");

        Lion lion = new Lion("red");
        lion.setPlanet("Morvir");
        lion.setLifeSpan(4500);
        lion.setType("mammal");

        Tree tree = new Tree(10, "oak");
        tree.setPlanet("Tatooine");
        tree.setLifeSpan(10000);
    }
}
