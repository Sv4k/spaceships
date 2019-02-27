package details;

public abstract class Engine {
    public abstract int getCost();
    public abstract int getStrength();
    public abstract int getSize();
    public abstract int getPower();
    public abstract int getMaxSpeed();
    public abstract int getMaxLengthOfHyperJump();
    public abstract Creator getCreator();
    public abstract int getNumberOfModules();

    public abstract Engine getCopy();

    @Override
    public String toString() {
        return "Engine with modules:\n";
    }
}
