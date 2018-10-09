package week4.task1;

public class Sanh_Orange extends Orange {
    //TODO: khai báo thêm thuộc tính
    boolean check;

    //TODO: tạo contructor cho đối tượng
    public Sanh_Orange(String color, String source, int price, String export, boolean check) {
        super(color, source, price, export);
        this.check = check;
    }

    public Sanh_Orange(String export, boolean check) {
        super(export);
        this.check = check;
    }

    public Sanh_Orange(boolean check) {
        this.check = check;
    }

    public Sanh_Orange(){}

    //TODO: tạo các getter, setter cho mỗi thuộc tính
    public boolean isCheck() { return check; }

    public void setCheck(boolean check) { this.check = check; }

    //TODO: viết phương thức
    public void to_check(){
        if(check) System.out.println("it's checked");
        else System.out.println("it's not checked");
    }
}
