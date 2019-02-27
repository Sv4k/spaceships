package details;

public class FuelTankWithHumanMadeModule extends FuelTank{
    FuelTank fuelTank;

    public FuelTankWithHumanMadeModule(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getCost() {
        return  fuelTank.getCost() + 2;
    }
    public int getSize() {
        return fuelTank.getSize() + 2;
    }
    public int getCapacity() {
        return fuelTank.getCapacity() + 2;
    }
    public int getStrength() {
        return fuelTank.getStrength() + 2;
    }
    public int getFuel() {
        return fuelTank.getFuel();
    }
    public Creator getCreator() {
        return fuelTank.getCreator();
    }

    public void tankUp() {
        fuelTank.tankUp();
    }
    public void tankUp(int litres) {
        if(litres < 0)
            throw new RuntimeException("You try to tank up the ship by negative number of litres. lol");
        if(fuelTank.getFuel() + litres > fuelTank.getCapacity() * 2)
            throw new RuntimeException("Too Many Fuel!");

        fuelTank.tankUp(litres);
    }
    public void spendFuel(int litres) {
        fuelTank.spendFuel(litres);
    }

    @Override
    public int getNumberOfModules() {
        return fuelTank.getNumberOfModules() + 1;
    }

    @Override
    public FuelTank getCopy() {
        return new FuelTankWithHumanMadeModule(fuelTank.getCopy());
    }

    @Override
    public String toString() {
        return fuelTank.toString() + "human made module\n";
    }
}
