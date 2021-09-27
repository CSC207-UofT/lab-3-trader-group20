/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class BikeTest {
    Bike b;

    @Before
    public void setUp() throws Exception {
        b = new Bike();
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, b.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(11, b.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(90, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, b.getPrice());
    }

}