package week4.task1;

class Fruit{
    //TODO: khai báo các thuộc tính
    String color,source;
    int price;

    //TODO: tạo contructor cho đối tượng
    public Fruit(String color, String source, int price) {
        this.color = color;
        this.source = source;
        this.price = price;
    }

    public Fruit() {}
    //TODO: tạo các getter, setter cho mỗi thuộc tính

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getSource() { return source; }

    public void setSource(String source) { this.source = source; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

}