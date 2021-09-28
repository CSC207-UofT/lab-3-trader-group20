/*
This file contains sample JUnit test cases for Spaceship.java
 */

import org.junit.*;

import static org.junit.Assert.*;

public class SpaceshipTest {
    Spaceship s;

    @Before
    public void setUp() throws Exception {
        s = new Spaceship();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(200000000, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(250000000, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(99, s.getPrice());
    }

}
