package pattern.decorator;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Bevrage bevrage = new Espresso();
        System.out.println(bevrage.getDescription() + " $" + bevrage.cost());

        Bevrage bevrage2 = new DarkRoast();
        bevrage2 = new Mocha(bevrage2);
        bevrage2 = new Mocha(bevrage2);
        bevrage2 = new Whip(bevrage2);
        System.out.println(bevrage2.getDescription() + " $" + bevrage2.cost());

        Bevrage bevrage3 = new HouseBlend();
        bevrage3 = new Soy(bevrage3);
        bevrage3 = new Mocha(bevrage3);
        bevrage3 = new Whip(bevrage3);
        System.out.println(bevrage3.getDescription() + " $" + bevrage3.cost());
    }
}
