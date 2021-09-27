
import org.junit.*;

import static org.junit.Assert.*;

public class TimeMachineTest {

    TimeMachine tm;

    @Before
    public void setUp() {
        tm = new TimeMachine();
    }


    @Test
    public void TestOperability() {
        assertTrue(tm.isOperable());
    }

    @Test
    public void TestBreaksWhenSlowed() {
        tm.downgradeSpeed();
        assertFalse(tm.isOperable());
    }

    @Test
    public void TestBreaksWhenHastened() {
        tm.upgradeSpeed();
        assertFalse(tm.isOperable());
    }

    @Test
    public void TestCanSetYear() {
        assertEquals(tm.getTargetYear(), 2021);
        tm.setTargetYear(2022);
        assertEquals(tm.getTargetYear(), 2022);
    }

    @Test
    public void TestCorrectPrice() {
        assertEquals(tm.getPrice(), Integer.MAX_VALUE);
    }

}
