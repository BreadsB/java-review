package org.breadsb.sandbox.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testIfTwoUserObjectsAreEqual() {
        User user1 = new User("Adam", "Eden", 27);
        User user2 = new User("Ronald", "Grim", 30);
        User user3 = new User("Adam", "Eden", 27, 400.0);
        User user4 = new User("Ronald", "Grim", 30);

        Assertions.assertNotEquals(user1, user2);
        Assertions.assertNotEquals(user1, user3);
        Assertions.assertEquals(user2, user4);
    }
}
