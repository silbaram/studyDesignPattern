package pattern.factory.pizza;

import pattern.factory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
