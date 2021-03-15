package pattern.factory.store;

import pattern.factory.ingredient.ChicagoPizzaIngredientFactory;
import pattern.factory.ingredient.PizzaIngredientFactory;
import pattern.factory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName(" Chicago Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza(pizzaIngredientFactory);
            pizza.setName(" Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza(pizzaIngredientFactory);
            pizza.setName(" Chicago Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza(pizzaIngredientFactory);
            pizza.setName(" Chicago Style Cheese Pizza");
        }

        return pizza;
    }
}
