import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demo.Task2.Client;

import java.time.LocalDate;

public class ClientTest {
    @BeforeEach
    void resetClientCounter() throws Exception {
        java.lang.reflect.Field counterField = Client.class.getDeclaredField("counter");
        counterField.setAccessible(true);
        counterField.setInt(null, 0);
    }

    @Test
    void testClientIdAutoIncrement() {
        Client client1 = new Client("john.doe@example.com", "John Doe", LocalDate.of(1990, 5, 15), "Male");
        Client client2 = new Client("jane.smith@example.com", "Jane Smith", LocalDate.of(1985, 8, 20), "Female");
        Client client3 = new Client("alice.brown@example.com", "Alice Brown", LocalDate.of(1992, 3, 10), "Female");

        assertEquals(0, client1.getId(), "First client ID should be 0");
        assertEquals(1, client2.getId(), "Second client ID should be 1");
        assertEquals(2, client3.getId(), "Third client ID should be 2");
    }

    @Test
    void testClientGetters() {
        String email = "john.doe@example.com";
        String name = "John Doe";
        LocalDate dob = LocalDate.of(1990, 5, 15);
        String sex = "Male";

        Client client = new Client(email, name, dob, sex);

        assertEquals(email, client.getEmail(), "Email should match");
        assertEquals(name, client.getName(), "Name should match");
        assertEquals(dob, client.getDob(), "Date of birth should match");
        assertEquals(sex, client.getSex(), "Sex should match");
    }
}
