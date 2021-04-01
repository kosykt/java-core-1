package HW11_3;

public class Orange extends Fruit{
    @Override
    protected Double mass() {
        return 1.5;
    }

    @Override
    protected Double getMass() {
        return super.getMass();
    }
}
