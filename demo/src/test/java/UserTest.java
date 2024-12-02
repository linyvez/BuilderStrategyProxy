import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import demo.Task1.User;

public class UserTest {

    @Test
    void testUserBuilderSetsAllFieldsCorrectly() {
        User user = User.builder()
                        .name("Alice")
                        .age(28)
                        .weight(60.5)
                        .height(165.0)
                        .build();

        assertNotNull(user);
        assertEquals("Alice", user.getName());
        assertEquals(28, user.getAge());
        assertEquals(60.5, user.getWeight());
        assertEquals(165.0, user.getHeight());
    }

    @Test
    void testUserBuilderWithMissingFields() {
        User user = User.builder()
                        .name("Bob")
                        .build();

        assertNotNull(user);
        assertEquals("Bob", user.getName());
        assertEquals(0, user.getAge());
        assertNull(user.getGender());
        assertEquals(0.0, user.getWeight());
        assertEquals(0.0, user.getHeight());
    }

    @Test
    void testUserBuilderImmutability() {
        User user = User.builder()
                        .name("Charlie")
                        .age(35)
                        .weight(80.0)
                        .height(180.0)
                        .build();


        assertEquals("Charlie", user.getName());
        assertEquals(35, user.getAge());
        assertEquals(80.0, user.getWeight());
        assertEquals(180.0, user.getHeight());
    }

    @Test
    void testUserToString() {
        User user = User.builder()
                        .name("Diana")
                        .age(22)
                        .weight(55.0)
                        .height(160.0)
                        .build();

        String expected = "User(name=Diana, age=22, gender=null, weight=55.0, height=160.0)";
        assertEquals(expected, user.toString());
    }

    @Test
    void testMultipleUsersHaveIndependentBuilders() {
        User user1 = User.builder()
                         .name("Eve")
                         .age(30)
                         .weight(65.0)
                         .height(170.0)
                         .build();

        User user2 = User.builder()
                         .name("Frank")
                         .age(40)
                         .weight(75.0)
                         .height(175.0)
                         .build();

        assertNotEquals(user1.getName(), user2.getName());
        assertNotEquals(user1.getAge(), user2.getAge());
        assertNotEquals(user1.getWeight(), user2.getWeight());
        assertNotEquals(user1.getHeight(), user2.getHeight());
    }
}