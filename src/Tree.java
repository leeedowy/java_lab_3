public class Tree extends Plant {

    private int growthRate;
    private String type;

    public Tree(int growthRate, String type) {
        this.growthRate = growthRate;
        this.type = type;
    }

    public int getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(int growthRate) {
        this.growthRate = growthRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
