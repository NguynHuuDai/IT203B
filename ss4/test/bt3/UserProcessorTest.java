package bt3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserProcessorTest {

    private UserProcessor processor;

    @BeforeEach
    void setUp() {
        processor = new UserProcessor();
    }

    @Test
    void testValidEmailShouldReturnSameEmail() {

        String email = "user@gmail.com";

        String result = processor.processEmail(email);

        assertEquals("user@gmail.com", result);
    }

    @Test
    void testEmailWithoutAtSymbolShouldThrowException() {

        // Arrange
        String email = "usergmail.com";

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            processor.processEmail(email);
        });
    }

    @Test
    void testEmailWithoutDomainShouldThrowException() {

        // Arrange
        String email = "user@";

        assertThrows(IllegalArgumentException.class, () -> {
            processor.processEmail(email);
        });
    }

    @Test
    void testEmailShouldBeNormalizedToLowercase() {

        String email = "Example@Gmail.com";

        String result = processor.processEmail(email);

        assertEquals("example@gmail.com", result);
    }
}