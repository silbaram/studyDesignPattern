package pattern.factory.store;

import pattern.factory.ingredient.NyPizzaIngredientFactory;
import pattern.factory.ingredient.PizzaIngredientFactory;
import pattern.factory.pizza.*;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();

        if ("cheese".equals(item)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName(" New York Style Cheese Pizza");
        } else if("veggie".equals(item)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if("clam".equals(item)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if("pepperoni".equals(item)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
