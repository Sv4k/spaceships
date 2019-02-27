package ships;

public class SmartFitter extends AbstractShipsFitter {
    @Override
    public SpaceShip getSpaceShip() {
        checkPossibilityOfFitting();

        SpaceShip ship = new SpaceShip();
        ship.setHull(hull.getCopy());
        ship.setTank(tank.getCopy());
        ship.setEngine(engine.getCopy());
        return ship;
    }

    public String getInfoAboutShip() {
        if(engine.getPower() < hull.getOwnSize() + engine.getSize() + tank.getSize())
            return "This ship can not fly =(\n";
        return "Hull:\n" + "hull size: " + hull.getOwnSize() + "\n" + "max. weight: " + hull.getMaxWeight() + "\n" + "max. engine size: " + hull.getMaxEngineSize() + "\n" + "max. fuel tank size: " + hull.getMaxTankSize() + "\n" + "cost: " + hull.getCost() + "\n" + "Engine:\n" + "size: " + engine.getSize() + "\n" + "power: " + engine.getPower() + "\n" + "max. speed: " + engine.getMaxSpeed() + "\n" + "max. hyperjump length: " + engine.getMaxLengthOfHyperJump() + "\n" + "strength: " + engine.getStrength() + "\n" + "cost: " + engine.getCost() + "\n" + "Fuel tank:\n" + "size: " + tank.getSize() + "\n" + "capacity: " + tank.getCapacity() + "\n" + "strength: " + "\n" + tank.getStrength() + "\n" + "cost: " + tank.getCost() + "\n";
    }
}
