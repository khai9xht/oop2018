package week4.task1;

public class Apple extends Fruit {
    //TODO: khai báo thêm thuộc tính
    int Weight;

    //TODO: tạo contructor cho đối tượng
    public Apple(String color, String source, int price, int weight) {
        super(color, source, price);
        Weight = weight;
    }

    public Apple(int weight) {
        Weight = weight;
    }

    public Apple(){}

    //TODO: tạo các getter, setter cho mỗi thuộc tính
    public int getWeight() { return Weight; }

    public void setWeight(int weight) { Weight = weight; }

    //TODO: viết phương thức
    int everage_price(){ return price/Weight;}
}
