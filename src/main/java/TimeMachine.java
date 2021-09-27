

public class TimeMachine implements Tradable, Drivable {

    private final int SPEED_OF_LIGHT = 299792458;

    private int maxSpeed;
    private int targetYear;

    public TimeMachine() {
        maxSpeed = SPEED_OF_LIGHT;
        targetYear = 2021;
    }

    /**
     * Increase the speed of the time machine
     */
    @Override
    public void upgradeSpeed() { maxSpeed++; }

    /**
     * Decrease the speed of the time machine
     */
    @Override
    public void downgradeSpeed() { maxSpeed--; }

    /**
     * @return whether this TimeMachine is still operating at the speed of light.
     */
    public boolean isOperable() { return maxSpeed == SPEED_OF_LIGHT; }

    /**
     * @return the current speed of the time machine (only has one speed hence the max speed is the current speed)
     */
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @return how much it would cost to buy the time machine in millions of dollars.
     */
    @Override
    public int getPrice() {
        return Integer.MAX_VALUE;
    }

    /**
     * @param targetYear the target year
     */
    public void setTargetYear(int targetYear) { this.targetYear = targetYear; }

    /**
     *
     * @return the year the time machine is currently set to
     */
    public int getTargetYear() { return targetYear; }

}
