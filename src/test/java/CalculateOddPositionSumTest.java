import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Test Naming Requirements:
 *  - Unique Name
 *  - Name describes what it is testing
 */
class CalculateOddPositionSumTest {
    @Test
    @DisplayName("Odd sum for credit card number 5388576018107076 is 32")
    void calculateOddSumForCreditCard5388576018107076() {
        assertEquals(32, CreditCardValidation.calculateOddPositionSum(5388576018107076L), 0.01);
    }


}
