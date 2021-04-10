import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HW14Test {

    public static HW14 hw;

    @Before
    public void init(){
        hw = new HW14();
    }

    @Test
    public void checkArr1() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5};
        Assert.assertArrayEquals(b, hw.checkArr(a));
    }

    @Test
    public void checkArr2() {
        int[] a = {1, 2, 3, 4};
        int[] b = {};
        Assert.assertArrayEquals(b, hw.checkArr(a));
    }

    @Test
    public void checkArr3() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {5, 6};
        Assert.assertArrayEquals(b, hw.checkArr(a));
    }
}