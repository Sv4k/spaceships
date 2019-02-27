package ships;

import details.Engine;
import details.FuelTank;
import details.Hull;

public abstract class AbstractShipsFitter {
    protected Engine engine;
    protected FuelTank tank;
    protected Hull hull;
    protected int valueOfWork;



    public void giveEngine(Engine otherEngine) {
        engine = otherEngine;
    }

    public void giveFuelTank(FuelTank otherTank) {
        tank = otherTank;
    }

    public void giveHull(Hull otherHull) {
        hull = otherHull;
    }

    public int countPriceOfSpaceShip() {
        return valueOfWork + engine.getCost() + tank.getCost() + hull.getCost();
    }

    public void checkPossibilityOfFitting() {
        if(hull == null || engine == null || tank == null)
            throw new FitterException("There are no enough details to fit the ship\n");
        if(hull.getMaxEngineSize() < engine.getSize())
            throw new FitterException("Engine is too large\n");
        if(hull.getMaxTankSize() < tank.getSize())
            throw new FitterException("Tank is too large\n");
        if(hull.getMaxWeight() < hull.getOwnSize() + engine.getSize() + tank.getSize())
            throw new FitterException("Weight limit of the ship is exceeded");
    }

    public abstract SpaceShip getSpaceShip();
}
