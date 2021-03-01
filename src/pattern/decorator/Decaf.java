package pattern.decorator;

public class Decaf extends Bevrage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
