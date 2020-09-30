package impl;

import abstraction.Pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "Chicago style sauce and cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
        toppings.add("Shredded mozzarella cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
