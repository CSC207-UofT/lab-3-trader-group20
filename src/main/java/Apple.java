public class Apple implements Tradable{
    private int price;

    public Apple(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
