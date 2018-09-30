package week3;

public class Week3 {
    /**
     * tìm giá trị lớn nhất
     * @param m đối số thứ nhất
     * @param n đối số thứ hai
     * @return giá trị lớn nhất của m và n
     */
    public static int max(int m, int n) {
        return m>n ? m : n;
    }

    /**
     * Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
     * @param array mảng chứa các giá trị kiểu integer
     * @return giá trị nhỏ nhát trong mảng
     */
    public static int minOfArray(int[] array) {
        int max = array[0];
        for(int i=1;i<array.length; i++){
            max = max < array[i] ? array[i] : max;
        }
        return max;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight/(height*height);
        if(BMI < 18.5) return("Thiếu cân");
        else if(BMI < 23) return("Bình thường");
        else if(BMI < 25) return("Thừa cân");
        else return("Béo phì");
    }
}
