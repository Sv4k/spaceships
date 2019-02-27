package details;

public abstract class FuelTank {

    public abstract int getCost();
    public abstract int getSize();
    public abstract int getCapacity();
    public abstract int getStrength();
    public abstract int getFuel();
    public abstract int getNumberOfModules();
    public abstract Creator getCreator();

    public abstract void tankUp();
    public abstract void tankUp(int litres);
    public abstract void spendFuel(int litres);
    public abstract FuelTank getCopy();

    @Override
    public String toString() {
        return "Fuel tank with modules:\n";
    }
}
