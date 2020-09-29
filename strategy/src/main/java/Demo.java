import behavior.RocketFly;
import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;

public class Demo {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.display();

        model.setFlyBehavior(new RocketFly());
        model.performFly();
    }
}
