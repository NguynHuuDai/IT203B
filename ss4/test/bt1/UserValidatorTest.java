package bt1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {

    UserValidator validator = new UserValidator();

    @Test
    void TC01_validUsername() {

        // Arrange
        String username = "user123";

        // Act
        boolean result = validator.isValidUsername(username);

        // Assert
        assertTrue(result);
    }

    @Test
    void TC02_usernameTooShort() {

        // Arrange
        String username = "abc";

        // Act
        boolean result = validator.isValidUsername(username);

        // Assert
        assertFalse(result);
    }

    @Test
    void TC03_usernameContainsSpace() {

        String username = "user name";

        boolean result = validator.isValidUsername(username);

        assertFalse(result);
    }
}