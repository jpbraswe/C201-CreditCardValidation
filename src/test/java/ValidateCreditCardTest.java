import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

/** Test Naming Requirements:
 *  - Unique Name
 *  - Name describes what it is testing
 */
class ValidateCreditCardTest {
    @Test
    @DisplayName("Credit card 4388576018410707 is valid")
    void validateCreditCardNumberAsValid4388576018410707() {
        // The L at the end of the number means it's a long type
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(4388576018410707L);
        } catch (Exception e) {
            fail();
        }
        assertTrue(response);
    }

    @Test
    @DisplayName("Credit card 67670738908615 is valid")
    void validateCreditCardNumberAsValid67670738908615() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(67670738908615L);
        } catch (Exception e) {
            fail();
        }
        assertTrue(response);
    }

    @Test
    @DisplayName("Credit card 4246345689049834 is invalid")
    void validateCreditCardNumberAsInvalid4246345689049834() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(4246345689049834L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }

    @Test
    @DisplayName("Credit card 438479389343787 is invalid")
    void validateCreditCardNumberAsInvalid438479389343787() {
        boolean response = false;
        try {
            response = CreditCardValidation.validateCreditCard(438479389343787L);
        } catch (Exception e) {
            fail();
        }
        assertFalse(response);
    }

}
