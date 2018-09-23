package week2.task2;

import java.util.Objects;

public class Fraction {
    // TODO: khai báo các thuộc tính
    int Numerator,Denominator;
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        Numerator = numerator;      Denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sum = new Fraction(1,1);
        sum.Numerator = this.Numerator*other.Denominator + this.Denominator*other.Numerator;
        sum.Denominator = this.Denominator*other.Denominator;
        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction minus = new Fraction(1,1);
        minus.Numerator = this.Numerator*other.Denominator - this.Denominator*other.Numerator;
        minus.Denominator = this.Denominator*other.Denominator;
        return minus;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multiply = new Fraction (1,1);
        multiply.Numerator = this.Numerator*other.Numerator;
        multiply.Denominator = this.Denominator* other.Denominator;
        return multiply;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction divide = new Fraction(1,1);
        divide.Numerator = this.Numerator*other.Denominator;
        divide.Denominator = this.Denominator*other.Numerator;
        return divide;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        Fraction minus = this.subtract(fraction);
        if(minus.Numerator * minus.Denominator == 0 ) return true;
        return false;
    }

    public void getFraction(){
        System.out.println(this.Numerator+"/"+this.Denominator);
    }
   /* public static void main(String[] args){
        Fraction a = new Fraction(5,7);
        Fraction b = new Fraction (10,21);
        Fraction x = a.add(b);       x.getFraction();
        Fraction y = a.subtract(b);  y.getFraction();
        Fraction z = a.multiply(b);  z.getFraction();
        Fraction t = a.divide(b);    t.getFraction();
        if(a.equals(b)) System.out.println("a=b");
        else System.out.println("a!=b");
    }*/
}