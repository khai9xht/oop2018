package week4.task1;

public class ThanhPhong_Orange  extends Orange{
    //TODO: khai báo thêm thuộc tính
    int amount;

    //TODO: tạo contructor cho đối tượng
    public ThanhPhong_Orange(String color, String source, int price, String export, int amount) {
        super(color, source, price, export);
        this.amount = amount;
    }

    public ThanhPhong_Orange(String export, int amount) {
        super(export);
        this.amount = amount;
    }

    public ThanhPhong_Orange(int amount) {
        this.amount = amount;
    }

    public ThanhPhong_Orange(){}

    //TODO: tạo các getter, setter cho mỗi thuộc tính

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }

    //TODO: viết phương thức
    int total_price(){ return price * amount; }
}
