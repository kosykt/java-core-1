import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HW14_1Test {

    public static HW14_1 hw;

    @Before
    public void init(){
        hw = new HW14_1();
    }

    @Test
    public void checkArr1() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5};
        Assert.assertArrayEquals(b, hw.checkArr(a));
    }
}