package week3;

import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    /**
     * kiểm tran hàm tìm số lớn nhất(max)
     */
    public void test_max(){
        Week3 week3 = new Week3();
        Assert.assertEquals(4,week3.max(4,2));
        Assert.assertEquals(19,week3.max(19,19));
        Assert.assertEquals(28,week3.max(4,28));
        Assert.assertEquals(2345,week3.max(0,2345));
        Assert.assertEquals(25,week3.max(25,0));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    /**
     *kiểm tra hàm tìm số lớn nhất trong dãy
     */
    public void test_minOfArray(){
        Week3 week3 = new Week3();
        //khởi tạo mảng để kiểm tra
        int[] x = {3,4,1,5,3,45,2,234,234,35,2};
        int[] y = {2314,234,1234,23,4,234};
        int[] z = {23,24,124,0,34,24,24,2,5235,2,34,223,5452,35,23,5425,42,5,2,35,3254,32,4,32,4};
        int[] t = {1,3,8,5,2,12};
        int[] w = {1,1,1,1,1,1,1,1,1,1,1,1,};
        Assert.assertEquals(234, week3.minOfArray(x));
        Assert.assertEquals(2314, week3.minOfArray(y));
        Assert.assertEquals(5452, week3.minOfArray(z));
        Assert.assertEquals(12, week3.minOfArray(t));
        Assert.assertEquals(1, week3.minOfArray(w));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    /**
     * kiểm tra hàm BMI
     */
    public void test_calculateBMI(){
        Week3 week3 = new Week3();
        Assert.assertEquals("Thiếu cân", week3.calculateBMI(45,1.7));
        Assert.assertEquals("Bình thường", week3.calculateBMI(60,1.75));
        Assert.assertEquals("Thừa cân", week3.calculateBMI(65,1.65));
        Assert.assertEquals("Béo phì", week3.calculateBMI(75,1.68));
        Assert.assertEquals("Bình thường", week3.calculateBMI(66,1.81));
    }
}
