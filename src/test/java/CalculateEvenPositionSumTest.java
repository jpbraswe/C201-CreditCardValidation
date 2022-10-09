import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Test Naming Requirements:
 *  - Unique Name
 *  - Name describes what it is testing
 */
class CalculateEvenPositionSumTest {
    @Test
    @DisplayName("Even sum for credit card number 5388576018107076 is 26")
    void calculateEvenSumForCreditCard5388576018107076() {
        assertEquals(26, CreditCardValidation.calculateEvenPositionSum(5388576018107076L), 0.01);
    }


}
