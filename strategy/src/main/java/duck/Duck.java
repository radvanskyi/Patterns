package duck;

import behavior.FlyBehavior;
import behavior.QuackBehavior;
import lombok.Getter;
import lombok.Setter;

@Setter
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swimming!");
    }
}
