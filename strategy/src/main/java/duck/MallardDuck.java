package duck;

import behavior.FlyWithWings;
import behavior.Quack;
import lombok.Setter;

@Setter
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
