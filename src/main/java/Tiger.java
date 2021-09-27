public class Tiger implements Domesticatable, Tradable{
    private final int price;

    public Tiger(int price){
        this.price = price;
    }

    @Override
    public String sound() {
        return "Growl!";
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
