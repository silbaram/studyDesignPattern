package pattern.factory;

import pattern.factory.pizza.Pizza;
import pattern.factory.store.ChicagoPizzaStore;
import pattern.factory.store.NYPizzaStore;
import pattern.factory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println("");
        System.out.println("");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
