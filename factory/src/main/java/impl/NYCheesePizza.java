package impl;

import abstraction.Pizza;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";
        toppings.add("Grated reggiano cheese");
    }
}
