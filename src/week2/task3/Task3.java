package week2.task3;

import java.util.Objects;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Employee{
    private String Name;                //tên
    private boolean Experience;          //kinh nghiệm
    private int Shifts;                 //số ca làm việc / 1 ngày
    private int overtimeShift;          //số ca làm thêm /1 tháng
    private static final int salary_per_shift_1 = 100000;     //ko có kinh nghiệm
    private static final int salary_per_shift_2 = 150000;     //có kinh nghiệm
    private static final int salary_per_overtimeShift = 170000;     //ca làm thêm
    public String getName() {
        return Name;
    }

    public void setName(String name) { Name = name; }

    public int getShifts() {
        return Shifts;
    }

    public void setShifts(int shifts) {
        Shifts = shifts;
    }

    public boolean isExperience() { return Experience; }

    public void setExperience(boolean experience) { Experience = experience; }

    public int getOvertimeShift() { return overtimeShift; }

    public void setOvertimeShift(int overtimeShift) { this.overtimeShift = overtimeShift; }

    public int monthlySalary(){            //tính tiền lườn hàng tháng( tùy vào số ca làm việc và kinh nghiệm công việc)
        if(Experience) return salary_per_shift_2*Shifts*30 + salary_per_overtimeShift*overtimeShift;
        else return salary_per_shift_1*Shifts*30 + salary_per_overtimeShift*overtimeShift;
    }

    public void changeExperience(){          //chuyển từ công nhân ko king nghiệm thành công nhân có kinh nghiệm  or sa thải
         if (Shifts*30+overtimeShift >= 200 && overtimeShift >=60 && !Experience) Experience = true;
         else if(Shifts*30+overtimeShift >= 200 && overtimeShift >=60 && Experience) System.out.println("lương tháng của "+this.getName()+" :"+ monthlySalary()*1.5);
         else if(Shifts*30+overtimeShift < 80)   System.out.println("Bạn đã bị sa thải");
    }

    public boolean compareTo(Employee m){       // so sánh độ chăm chỉ
        return (this.Shifts+this.overtimeShift > m.Shifts +m.overtimeShift) ;
    }
}

class tri_angle{
    private double a,b,c;       //độ dài 3 cạnh

    public double getA() { return a; }

    public void setA(double a) { this.a = a; }

    public double getB() { return b; }

    public void setB(double b) { this.b = b; }

    public double getC() { return c; }

    public void setC(double c) { this.c = c; }

    public boolean is_tri_angle(){          //kiểm tra có phải là tam giác ko
        return ((a+b > c) && (b+c > a) && (c+a > b) && (a >0 ) && (b > 0) && (c > 0));
    }

    public double premeter(){               //tính chu vi
        return a+b+c;
    }

    public double Area(){                 //tính diện tích
        double p = premeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public boolean isEqual(tri_angle x){    //2 tam giác - nhau
        return this.a == x.a && this.b == x.b && this.c == x.c;
    }

    public boolean Similar(tri_angle x){        // 2 tam giác đồng dạng
        return this.a/x.a == this.b/x.b && this.b/x.b == this.c/x.c;
    }
}

class electricFan{          //quạt điện
    private int Von, Ampe;
    private int Producer;           //nhà sản xuất
    private boolean status;         //trạng thái hoạt động
    private int hoursPerDay;
    private static final int fee1 = 1500;       //giá tiền điện 50 số đầu
    private static final int fee2 = 2000;       //giá tiền từ 51->100
    private static final int fee3 =  2500;      //giá tiền từ 101 trở đi

    public int getHoursPerDay() { return hoursPerDay; }

    public void setHoursPerDay(int hoursPerDay) { this.hoursPerDay = hoursPerDay; }

    public int getVon() { return Von; }

    public void setVon(int von) { Von = von; }

    public boolean isStatus() { return status; }

    public void setStatus(boolean status) { this.status = status; }

    public int getProducer() { return Producer; }

    public void setProducer(int producer) { Producer = producer; }

    public int getAmpe() { return Ampe; }

    public void setAmpe(int ampe) { Ampe = ampe; }

    public int capacity(){          //công suất
        return Von*Ampe;
    }

    public int feeOfFan(){              // tiền điện hàng tháng
        int numberOfElecttic = (this.capacity()*hoursPerDay*3600*30)/3600000; //tính số điện
        if(numberOfElecttic <= 50) return numberOfElecttic*fee1;                //gía 50 số đầu
        else if(numberOfElecttic <= 100) return 50*fee1 +(numberOfElecttic - 50)*fee2;  //51->100
        else return 50*fee1 +50*fee2 +(numberOfElecttic-100)*fee3;                      //>100
    }
    public boolean testFun(int von, int ampe){       // kiểm tra quạt
        return !(von < Von || von > Von*Math.sqrt(2) || ampe < Ampe || ampe > Ampe*Math.sqrt(2));
    }
}
