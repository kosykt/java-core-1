import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class HW14_1Test {

    public static HW14_1 hw;
    public static int[] arr = {1, 2, 3, 4, 5};
    public static int[] arr1 = {5};

    @Before
    public void init() {
        hw = new HW14_1();
    }

    @Test
    public void checkArr1() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5};
        Assert.assertArrayEquals(b, hw.checkArr(a));
    }

//    @BeforeEach
//    public void init() {
//        hw = new HW14_1();
//    }
//
//    @CsvSource({
//            "arr, arr1"
//    })
//    @ParameterizedTest
//    public void checkArr1(int[] a, int[] result){
//        Assertions.assertArrayEquals(result, hw.checkArr(a));
//    }

}