package powerpackage;
//fixed the naming conventions and typo errors
//used assertEquals method for the tests to run successfully

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerFinderTest {
    @Test
    public void oneRaisedToOneIsOneTest() {
        assertEquals(1, PowerFinder.getPowerOf(1, 1));
    }

    @Test
    public void twoRaisedToTwoIsTwoTest() {
        assertEquals(2, PowerFinder.getPowerOf(2, 1));
    }

    @Test
    public void twoRaisedToTwoIsFourTest() {
        assertEquals(4, PowerFinder.getPowerOf(2, 2));
    }

    @Test
    public void ThreeRaisedToTwoIsNineTest() {
        assertEquals(9, PowerFinder.getPowerOf(3, 2));
    }
}
