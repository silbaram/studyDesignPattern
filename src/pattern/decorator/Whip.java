package pattern.decorator;

public class Whip extends CondimentDecorator {

    Bevrage bevrage;

    public Whip(Bevrage bevrage) {
        this.bevrage = bevrage;
    }

    @Override
    public String getDescription() {
        return bevrage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public double cost() {
        return .10 + bevrage.cost();
    }
}
