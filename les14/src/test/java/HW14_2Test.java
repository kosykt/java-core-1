import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HW14_2Test {

    public static HW14_2 hw;

    @Before
    public void init(){
        hw = new HW14_2();
    }

    @Test
    public void check() {
        int[] a = {1, 2, 3, 4, 5};
        Assert.assertTrue(hw.check(a));
    }
}