package bt4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordServiceTest {

    PasswordService service = new PasswordService();

    @Test
    void testStrongPassword() {
        String result = service.evaluatePasswordStrength("Abc123!@");
        assertEquals("Mạnh", result);
    }

    @Test
    void testMissingUppercase() {
        String result = service.evaluatePasswordStrength("abc123!@");
        assertEquals("Trung bình", result);
    }

    @Test
    void testMissingLowercase() {
        String result = service.evaluatePasswordStrength("ABC123!@");
        assertEquals("Trung bình", result);
    }

    @Test
    void testMissingNumber() {
        String result = service.evaluatePasswordStrength("Abcdef!@");
        assertEquals("Trung bình", result);
    }

    @Test
    void testMissingSpecialChar() {
        String result = service.evaluatePasswordStrength("Abc12345");
        assertEquals("Trung bình", result);
    }

    @Test
    void testPasswordTooShort() {
        String result = service.evaluatePasswordStrength("Ab1!");
        assertEquals("Yếu", result);
    }

    @Test
    void testOnlyLowercase() {
        String result = service.evaluatePasswordStrength("password");
        assertEquals("Yếu", result);
    }

    @Test
    void testUppercaseAndNumberOnly() {
        String result = service.evaluatePasswordStrength("ABC12345");
        assertEquals("Yếu", result);
    }
}