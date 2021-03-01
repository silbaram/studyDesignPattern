package pattern.decorator;

public class Mocha extends CondimentDecorator {
    Bevrage bevrage;

    public Mocha(Bevrage bevrage) {
        this.bevrage = bevrage;
    }

    @Override
    public String getDescription() {
        return bevrage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return .20 + bevrage.cost();
    }
}
