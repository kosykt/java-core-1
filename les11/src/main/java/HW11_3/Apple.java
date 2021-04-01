package HW11_3;

public class Apple extends Fruit {
    @Override
    protected Double mass() {
        return 1.0;
    }

    @Override
    protected Double getMass() {
        return super.getMass();
    }
}
