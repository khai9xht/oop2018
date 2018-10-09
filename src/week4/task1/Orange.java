package week4.task1;
public class Orange extends Fruit {
    //TODO: khai báo thêm thuộc tính
    String export;

    //TODO: tạo contructor cho đối tượng
    public Orange(String color, String source, int price, String export) {
        super(color, source, price);
        this.export = export;
    }
    public Orange(String export) {
        this.export = export;
    }
    public Orange(){}

    //TODO: tạo các getter, setter cho mỗi thuộc tính
    public String getExport() { return export; }

    public void setExport(String export) { this.export = export; }

    //TODO: viết phương thức
    void update_price(){
        if(export.equals("China")) price = price*2;
        else if(export.equals("america")) price = price*3;
    }

}
