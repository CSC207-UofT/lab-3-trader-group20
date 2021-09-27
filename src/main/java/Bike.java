// A class that represents a drivable, tradable bike
public class Bike implements Drivable, Tradable{
    private int maxSpeed;
    private int price;

    public Bike() {
        this.maxSpeed = 10;
        this.price = 1000;
    }

    public Bike(int max_speed, int price) {
        this.maxSpeed = max_speed;
        this.price = price;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }


}
