import details.Color;
import details.Creator;
import details.Engine;
import details.Factory;
import ships.BasicFitter;
import ships.FitterException;
import ships.SmartFitter;
import ships.SpaceShip;

public class Main {
    public  static void main(String[] args) {
        Factory humanFactory = new Factory(Creator.HUMAN_CREATOR);
        Factory alienFactory = new Factory(Creator.ALIEN_CREATOR);

        BasicFitter stupidFitter = new BasicFitter();
        SmartFitter smartFitter = new SmartFitter();

        stupidFitter.giveEngine(humanFactory.produceEngine());
        stupidFitter.giveHull(alienFactory.produceHull());
        stupidFitter.giveFuelTank(humanFactory.produceFuelTank());

        smartFitter.giveEngine(alienFactory.produceEngine());
        smartFitter.giveHull(alienFactory.produceHull());
        smartFitter.giveFuelTank(alienFactory.produceFuelTank());

        try{
            SpaceShip ship = smartFitter.getSpaceShip();
            SpaceShip anotherShip = smartFitter.getSpaceShip();

            anotherShip.changeColor(Color.BLUE);
            Engine newEngine = alienFactory.produceEngine();
            newEngine = alienFactory.produceUpgradeEngine(newEngine);
            anotherShip.setEngine(newEngine);

            ship.takeOff();
            ship.hyperJump(2);
            ship.hyperJump(800);
            ship.landDown();
            ship.tankUp();
            System.out.println(ship);
            System.out.println(anotherShip);
        } catch (FitterException ex) {
            System.out.println(ex.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
