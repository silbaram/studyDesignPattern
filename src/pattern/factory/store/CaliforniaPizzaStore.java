package pattern.factory.store;

import pattern.factory.ingredient.CaliforniaPizzaIngredientFactory;
import pattern.factory.ingredient.PizzaIngredientFactory;
import pattern.factory.pizza.*;

public class CaliforniaPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName(" California Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza(pizzaIngredientFactory);
            pizza.setName(" California Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza(pizzaIngredientFactory);
            pizza.setName(" California Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza(pizzaIngredientFactory);
            pizza.setName(" California Style Cheese Pizza");
        }

        return pizza;
    }
}
