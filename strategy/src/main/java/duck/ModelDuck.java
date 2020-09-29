package duck;

import behavior.FlyNoWings;
import behavior.Spueak;
import lombok.Setter;

@Setter
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Spueak();
        flyBehavior = new FlyNoWings();
    }

    @Override
    public void display() {
        System.out.println("Model duck");
    }
}
