public class Spaceship implements Tradable, Drivable{
    private int maxspeed;

    private final int upperSpeedLimit = 300000000;
    private final int lowerSpeedLimit = 100000000;

    public Spaceship() {
        this.maxspeed = 200000000;
    }

    @Override
    public void upgradeSpeed() {
        this.maxspeed = (upperSpeedLimit + this.maxspeed) / 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed = (lowerSpeedLimit + this.maxspeed) / 2;
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
