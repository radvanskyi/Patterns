package service;

import abstraction.Pizza;
import impl.NYCheesePizza;
import impl.ClamPizza;
import impl.PepperoniPizza;
import impl.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch(type){
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}
