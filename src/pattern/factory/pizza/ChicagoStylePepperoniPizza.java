package pattern.factory.pizza;

import pattern.factory.ingredient.PizzaIngredientFactory;

public class ChicagoStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
