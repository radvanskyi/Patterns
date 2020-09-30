import abstraction.Pizza;
import service.ChicagoPizzaStore;
import service.NYPizzaStore;
import service.PizzaStore;

public class Demo {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        System.out.println("=============");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
