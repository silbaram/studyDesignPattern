package pattern.decorator;

public class SteamMilk extends CondimentDecorator {

    Bevrage bevrage;

    public SteamMilk(Bevrage bevrage) {
        this.bevrage = bevrage;
    }

    @Override
    public String getDescription() {
        return bevrage.description + ", 스팀 밀크";
    }

    @Override
    public double cost() {
        return .10 + bevrage.cost();
    }
}
