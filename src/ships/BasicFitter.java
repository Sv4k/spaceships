package ships;

public class BasicFitter extends AbstractShipsFitter {
    @Override
    public SpaceShip getSpaceShip() {
        checkPossibilityOfFitting();

        SpaceShip ship = new SpaceShip();
        ship.setHull(hull);
        ship.setEngine(engine);
        ship.setTank(tank);
        hull = null;
        engine = null;
        tank = null;
        return ship;
    }
}
