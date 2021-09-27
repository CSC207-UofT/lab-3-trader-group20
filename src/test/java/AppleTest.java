import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {
    Apple a;

    @Before
    public void setUp() throws Exception {
        a = new Apple(5);
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, a.getPrice());
    }
}
