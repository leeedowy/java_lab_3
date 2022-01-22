public class Lion extends Animal {

    private String favoriteMeat;

    public Lion(String favoriteMeat) {
        this.favoriteMeat = favoriteMeat;
    }

    public String getFavoriteMeat() {
        return favoriteMeat;
    }

    public void setFavoriteMeat(String favoriteMeat) {
        this.favoriteMeat = favoriteMeat;
    }
}
