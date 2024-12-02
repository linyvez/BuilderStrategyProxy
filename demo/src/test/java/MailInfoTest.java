import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import demo.Task2.Client;
import demo.Task2.MailInfo;
import demo.Task2.mailcode.*;

import java.time.LocalDate;

public class MailInfoTest {

    @Test
    void testMailInfoGenerate() {
        MailCode birthdayMail = new BirthdayCode();
        Client client = new Client("alice.brown@example.com", "Alice Brown", LocalDate.of(1992, 3, 10), "Female");
        MailInfo mailInfo = new MailInfo(client, birthdayMail);

        String expectedMessage = "Dear Alice Brown! Happy Birthday!";
        String actualMessage = mailInfo.generate();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testMailInfoGetEmail() {
        MailCode giftMail = new BirthdayCode();
        Client client = new Client("bob.jones@example.com", "Bob Jones", LocalDate.of(1988, 12, 5), "Male");
        MailInfo mailInfo = new MailInfo(client, giftMail);

        String expectedEmail = "bob.jones@example.com";
        String actualEmail = mailInfo.getEmail();

        assertEquals(expectedEmail, actualEmail);
    }
}
