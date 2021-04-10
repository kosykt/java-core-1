import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HW14_2Test {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4}, true},
                {new int[]{1, 1, 4}, true},
                {new int[]{1, 2, 3, 4, 5}, true},
                {new int[]{1, 1, 1, 2, 2, 5}, false},
                {new int[]{4, 4, 4, 5, 5, 5, 5}, false},
        });
    }

    HW14_2 hw = new HW14_2();

    private int[] arr;
    private boolean answer;

    public HW14_2Test(int[] arr, boolean answer) {
        this.arr = arr;
        this.answer = answer;
    }

    @Test
    public void checkTest() {
        Assert.assertEquals(answer, hw.check(arr));
    }
}