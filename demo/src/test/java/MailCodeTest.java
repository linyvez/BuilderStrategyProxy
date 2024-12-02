import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import demo.Task2.Client;
import demo.Task2.mailcode.BirthdayCode;
import demo.Task2.mailcode.MailCode;


import java.time.LocalDate;

public class MailCodeTest {

    @Test
    void testBirthdayGreetingMailCode() {
        MailCode birthdayMail = new BirthdayCode();
        Client client = new Client("john.doe@example.com", "John Doe", LocalDate.of(1990, 5, 15), "Male");

        String expectedMessage = "Dear John Doe! Happy Birthday!";
        String actualMessage = birthdayMail.generate(client);

        assertEquals(expectedMessage, actualMessage);
    }

}
