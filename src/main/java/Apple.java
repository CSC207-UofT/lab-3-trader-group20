public class Apple implements Tradable{
    private int PRICE;

    public Apple(int price) {
        this.PRICE = price;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
