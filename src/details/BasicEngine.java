package details;

public class BasicEngine extends Engine {
    private int size = 1;
    private int power = 2;
    private int maxSpeed = 2;
    private int maxLengthOfHyperJump = 2;
    private int cost = 5;
    private int strength = 4;
    private Creator creator;


    public BasicEngine(Creator creator, int size, int power, int maxSpeed, int maxLengthOfHyperJump, int cost, int strength) {
        this.creator = creator;
        this.size = size;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.maxLengthOfHyperJump = maxLengthOfHyperJump;
        this.cost = cost;
        this.strength = strength;
    }

    public int getCost() {
        return cost;
    }
    public int getStrength() {
        return strength;
    }
    public int getSize() {
        return size;
    }
    public int getPower() {
        return power;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getMaxLengthOfHyperJump() {
        return maxLengthOfHyperJump;
    }
    public Creator getCreator() {
        return creator;
    }


    @Override
    public int getNumberOfModules() {
        return 1;
    }

    @Override
    public Engine getCopy() {
        return new BasicEngine(creator, size, power, maxSpeed, maxLengthOfHyperJump, cost, strength);
    }

    @Override
    public String toString() {
        return super.toString() + "  " + creator + "_MADE basic\n";
    }
}
