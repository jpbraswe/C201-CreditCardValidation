import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Test Naming Requirements:
 *  - Unique Name
 *  - Name describes what it is testing
 */
class GetCreditCardSizeTest {
    @Test
    @DisplayName("Size of credit card number 5388576018107076 is 16")
    void getCreditCard5388576018107076Size() {
        assertEquals(16, CreditCardValidation.getCreditCardSize(5388576018107076L), 0.01);
    }


}
