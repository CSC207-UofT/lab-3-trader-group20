public class Spaceship implements Tradable, Drivable{
    private int maxspeed;

    public Spaceship() {
        this.maxspeed = 200000000;
    }

    @Override
    public void upgradeSpeed() {
        this.maxspeed = (300000000 + this.maxspeed) / 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed = (100000000 + this.maxspeed) / 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }

    @Override
    public int getPrice() {
        return 99;
    }

    public String toString() {
        return "Spaceship{" +
                "maxspeed=" + maxspeed +
                '}';
    }
}
