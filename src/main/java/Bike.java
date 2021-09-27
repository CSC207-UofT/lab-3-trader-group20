// A class that represents a drivable, tradable bike
public class Bike implements Drivable, Tradable{
    public int max_Speed;
    private int price;

    public Bike(int max_speed, int price) {
        this.max_Speed = max_speed;
        this.price = price;
    }

    public Bike() {
        this.max_Speed = 10;
        this.price = 1000;
    }

    @Override
    public void upgradeSpeed() {
        this.max_Speed++;
    }

    @Override
    public void downgradeSpeed() {
        this.max_Speed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.max_Speed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }


}
