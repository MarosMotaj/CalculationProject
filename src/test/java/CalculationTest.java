import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sk.maros.calculation.Calculation;

/**
 * This class contains test methods.
 */
class CalculationTest {

    private final Calculation calculation = new Calculation();

    /**
     * Basic functional test one.
     */
    @Test
    void multiplyTestCaseOne() {
        assertEquals(calculation.multiplyBigInt("12345678901234567890", "11111111111111111111"),
                calculation.scratchMultiply("12345678901234567890", "11111111111111111111"));
    }

    /**
     * Basic functional test two.
     */
    @Test
    void multiplyTestCaseTwo() {
        assertEquals(calculation.multiplyBigInt("000012345678901234567890", "11111111111111111111"),
                calculation.scratchMultiply("000012345678901234567890", "11111111111111111111"));
    }

    /**
     * Testing for zero inputs.
     */
    @Test
    void multiplyTestCaseThree() {
        assertEquals(calculation.multiplyBigInt("0", "0"),
                calculation.scratchMultiply("0", "0"));
    }
}