import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void testSumInts() throws Exception {
        assertEquals(3, calculator.sumInts(1,2));
    }
}