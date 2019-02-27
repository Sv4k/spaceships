package ships;

import details.*;

public class SpaceShip {
    private Hull hull;
    private Engine engine;
    private FuelTank tank;
    private boolean isInSpace = false;



    public void setEngine(Engine engine) {
        if(engine == null)
            throw new RuntimeException("There is nothing to set");
        if(engine.getSize() > hull.getMaxEngineSize())
            throw new RuntimeException("You try to set too large engine");
        this.engine = engine;
    }

    public void setHull(Hull hull) {
        this.hull = hull;
    }

    public void setTank(FuelTank tank) {
        if(tank == null)
            throw new RuntimeException("There is nothing to set");
        if(tank.getSize() > hull.getMaxTankSize())
            throw new RuntimeException("You try to set too large fuel tank");
        this.tank = tank;
    }

    public void tankUp() {
        tank.tankUp();
    }

    public void tankUp(int litres) {
        tank.tankUp(litres);
    }

    public void takeOff() {
        if(engine.getPower() < hull.getOwnSize() + engine.getSize() + tank.getSize())
            System.out.println("this ship can not fly");
        else
            isInSpace = true;
    }

    public void landDown() {
        isInSpace = false;
    }

    public void hyperJump(int length) {
        if(!isInSpace)
            throw  new RuntimeException("You need to be in the space to jump");
        if(length < engine.getMaxLengthOfHyperJump())
            try {
                tank.spendFuel(length);
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
    }

    public void changeColor(Color color) {
        hull.changeColor(color);
    }

    @Override
    public String toString() {
        return hull.toString() + "hull size: " + hull.getOwnSize() + "\n" + "max. weight: " + hull.getMaxWeight() + "\n" + "max. engine size: " + hull.getMaxEngineSize() + "\n" + "max. fuel tank size: " + hull.getMaxTankSize() + "\n" + "cost: " + hull.getCost() + "\n" + engine.toString() + "size: " + engine.getSize() + "\n" + "power: " + engine.getPower() + "\n" + "max. speed: " + engine.getMaxSpeed() + "\n" + "max. hyperjump length: " + engine.getMaxLengthOfHyperJump() + "\n" + "strength: " + engine.getStrength() + "\n" + "cost: " + engine.getCost() + "\n" + tank.toString() + "size: " + tank.getSize() + "\n" + "capacity: " + tank.getCapacity() + "\n" + "strength: " + "\n" + tank.getStrength() + "\n" + "cost: " + tank.getCost() + "\n";
    }


}
