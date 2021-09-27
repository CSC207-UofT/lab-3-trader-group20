/*
 * This file contains JUnit test cases for Dog.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class DogTest {
    Dog dog;

    @Before
    public void setUp() throws Exception {
        dog = new Dog();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("woof!", dog.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, dog.getPrice());
    }

}