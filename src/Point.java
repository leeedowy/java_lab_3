/* klasa Punkt */
public class Point {
    /* stworzyć zmienne prywatne pX, pY, pZ */

    private int pX;
    private int pY;
    private int pZ;

    public Point() {    }

    public Point(int pX) {
        this.pX = pX;
    }

    public Point(int pX, int pY, int pZ) {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getpY() {
        return pY;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }

    public int getpZ() {
        return pZ * 10;
    }

    public void setpZ(int pZ) {
        this.pZ = pZ;
    }

    public int sum() {
        return this.pX + this.pY + this.pZ;
    }

    public int difference() {
        return this.pX - this.pY - this.pZ;
    }

    public int difference(int x, int y, int z) {
        return pX*x - pY*y - pZ*z;
    }

    @Override
    public String toString() {
        return String.format("punkt(x=%d, y=%d, z=%d)", this.pX, this.pY, this.pZ);
    }

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
}
