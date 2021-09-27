import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TigerTest {
    Tiger tiger;

    @Before
    public void setUp() {
        tiger = new Tiger(200);
    }

    @Test
    public void TestSound() {
        assertEquals("Growl!", tiger.sound());
    }

    @Test
    public void TestGetPrice() {
        assertEquals(200, tiger.getPrice());
    }
}
