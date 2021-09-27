import org.junit.*;

import static org.junit.Assert.*;


public class CarTest {
    Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car(1000);
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, car.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        car.upgradeSpeed();
        assertEquals(2, car.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        car.downgradeSpeed();
        assertEquals(0, car.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, car.getPrice());
    }

}
