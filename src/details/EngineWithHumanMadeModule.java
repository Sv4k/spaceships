package details;

public class EngineWithHumanMadeModule extends Engine{
    Engine engine;

    public EngineWithHumanMadeModule(Engine engine) {
        this.engine = engine;
    }

    public int getCost() {
        return engine.getCost() + 2;
    }
    public int getStrength() {
        return engine.getStrength() + 2;
    }
    public int getSize() {
        return engine.getSize() + 2;
    }
    public int getPower() {
        return engine.getPower() + 2;
    }
    public int getMaxSpeed() {
        return engine.getMaxSpeed() + 2;
    }
    public int getMaxLengthOfHyperJump() {
        return engine.getMaxLengthOfHyperJump() + 2;
    }
    public Creator getCreator() {
        return engine.getCreator();
    }


    @Override
    public Engine getCopy() {
        return new EngineWithHumanMadeModule(engine.getCopy());
    }

    @Override
    public int getNumberOfModules() {
        return engine.getNumberOfModules() + 1;
    }

    @Override
    public String toString() {
        return engine.toString() + "human made module\n";
    }
}
