package details;

public class BasicFuelTank extends FuelTank{
    private int size = 1;
    private int capacity = 2;
    private int strength = 4;
    private int cost = 5;
    private int fuel;
    private Creator creator;


    public BasicFuelTank(Creator creator, int size, int capacity, int strength, int cost) {
        this.creator = creator;
        this.size = size;
        this.capacity = capacity;
        this.strength = strength;
        this.cost = cost;
    }

    public int getCost() {
        return  cost;
    }
    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getStrength() {
        return strength;
    }
    public int getFuel() {
        return fuel;
    }
    public Creator getCreator() {
        return creator;
    }

    public void tankUp() {
        fuel = capacity;
    }
    public void tankUp(int litres) {
        if(litres < 0)
            throw new RuntimeException("You try to tank up the ship by negative number of litres. lol");
        if(fuel + litres > capacity)
            throw new RuntimeException("Too Many Fuel!");

        fuel += litres;
    }
    public void spendFuel(int litres) {
        if(litres > fuel)
            throw new RuntimeException("There are no enough fuel");
        if(litres < 0)
            throw new RuntimeException("You try to spend a negative number of litres. lol");

        fuel -= litres;
    }

    @Override
    public int getNumberOfModules() {
        return 1;
    }

    @Override
    public FuelTank getCopy() {
        return new BasicFuelTank(creator, size, capacity, strength, cost);
    }

    @Override
    public String toString() {
        return super.toString() + "  " +creator + "_MADE basic\n";
    }
}
