public class Horse extends Animal {

    private String favoritePlant;

    public Horse(String favoritePlant) {
        this.favoritePlant = favoritePlant;
    }

    public String getFavoritePlant() {
        return favoritePlant;
    }

    public void setFavoritePlant(String favoritePlant) {
        this.favoritePlant = favoritePlant;
    }
}
