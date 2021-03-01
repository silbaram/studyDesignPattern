package pattern.decorator;

public class Soy extends CondimentDecorator {

    Bevrage bevrage;

    public Soy(Bevrage bevrage) {
        this.bevrage = bevrage;
    }

    @Override
    public String getDescription() {
        return bevrage.description + ", 두유";
    }

    @Override
    public double cost() {
        return .15 + bevrage.cost();
    }
}
