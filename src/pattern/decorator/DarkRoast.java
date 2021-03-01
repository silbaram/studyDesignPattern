package pattern.decorator;

public class DarkRoast extends Bevrage {

    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return .99;
    }
}
