package details;

public class Factory {
    Creator creator;

    public Factory(Creator creator) {
        this.creator = creator;
    }

    public Engine produceEngine() {
        switch (creator) {
            case ALIEN_CREATOR:
                return new BasicEngine(creator, 1, 8, 3, 3, 5, 3);
            case HUMAN_CREATOR:
                return new BasicEngine(creator, 2, 6, 2, 2, 2, 3);
        }
        return null;
    }

    public FuelTank produceFuelTank() {
        switch (creator) {
            case ALIEN_CREATOR:
                return new BasicFuelTank(creator, 1, 10, 3, 5);
            case HUMAN_CREATOR:
                return new BasicFuelTank(creator, 2, 5, 2, 2);
        }
        return null;
    }

    public Hull produceHull() {
        switch (creator) {
            case ALIEN_CREATOR:
                return new Hull(creator, 2, 25, 7, 7, 5);
            case HUMAN_CREATOR:
                return new Hull(creator, 3, 15, 5, 5, 2 );
        }
        return null;
    }

    public Engine produceUpgradeEngine(Engine engine) {
        switch (creator) {
            case HUMAN_CREATOR:
                return new EngineWithHumanMadeModule(engine);
            case ALIEN_CREATOR:
                return new EngineWithAlienMadeModule(engine);
        }
        return null;
    }

    public FuelTank produceUpgradeTank(FuelTank tank) {
        switch (creator) {
            case HUMAN_CREATOR:
                return new FuelTankWithHumanMadeModule(tank);
            case ALIEN_CREATOR:
                return new FuelTankWithAlienMadeModule(tank);
        }
        return null;
    }
}
