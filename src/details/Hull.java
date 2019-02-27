package details;

public class Hull {
    private int ownSize = 1;
    private int maxWeight = 8;
    private int maxEngineSize = 5;
    private int maxTankSize = 3;
    private int cost = 7;
    private Color color;
    private Creator creator;


    public Hull(Creator creator, int ownSize, int maxWeight, int maxEngineSize, int maxTankSize, int cost) {
        this.creator = creator;
        this.ownSize = ownSize;
        this.maxWeight = maxWeight;
        this.maxEngineSize = maxEngineSize;
        this.maxTankSize = maxTankSize;
        this.cost = cost;
        color = (creator == Creator.HUMAN_CREATOR) ? Color.GREY : Color.GOLDEN;
    }
    public  int getCost() {
        return cost;
    }
    public int getOwnSize(){
        return ownSize;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public int getMaxEngineSize() {
        return maxEngineSize;
    }
    public int getMaxTankSize() {
        return maxTankSize;
    }
    public String getColor() {
        return color.name();
    }
    public String getCreator() {
        return creator.name();
    }



    public void changeColor(Color color) {
        this.color = color;
    }

    public Hull getCopy() {
        Hull copy = new Hull(creator, ownSize, maxWeight, maxEngineSize, maxTankSize, cost);
        copy.changeColor(color);
        return copy;
    }

    @Override
    public String toString() {
        return creator + "_MADE " + color + " hull\n";
    }
}
