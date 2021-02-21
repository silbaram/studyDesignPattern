package pattern.duck;

import pattern.duck.Duck;
import pattern.duck.MallardDuck;
import pattern.duck.ModelDuck;
import pattern.duck.action.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
