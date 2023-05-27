package org.breadsb.sandbox.collections.users;

import org.breadsb.sandbox.collections.users.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class UserTestSuite {

    @Nested
    class InnerTests {
        User user1, user2;

        @BeforeEach
        void setup() {
            user1 = new User("Adam", "Eden", 27);
            user2 = new User("Ronald", "Grim", 30);
        }

        @Test
        void checkUserKeyEquality() {
            //GIVEN
            byte[] keyArray = new byte[] {1,2,3,4,5};
            UserKey key1 = new UserKey(keyArray);
            UserKey key2 = new UserKey(new byte[] {1,2,3,4,5});

            Map<UserKey, User> userMap = new HashMap<>();
            //WHEN
            userMap.put(key1, user1);
            userMap.put(key2, user2);
            //THEN
            String actual = "Ronald";
            String expected = userMap.get(key1).getFirstName();
            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    void testIfTwoUserObjectsAreEqual() {
//        GIVEN & WHEN
        User user1 = new User("Adam", "Eden", 27);
        User user2 = new User("Ronald", "Grim", 30);
        User user3 = new User("Adam", "Eden", 27, 400.0);
        User user4 = new User("Ronald", "Grim", 30);
//        THEN
        Assertions.assertNotEquals(user1, user2);
        Assertions.assertNotEquals(user1, user3);
        Assertions.assertEquals(user2, user4);
    }

    @Test
    void addRankToUser() {
        //GIVEN
        User user = new User("Adam", "Eden", 27);
        //WHEN
        user.addRank(20.0);
        //THEN
        Assertions.assertEquals(20.0, user.getRank());
    }

    @Test
    void putUsersToHashMapAndCheckEquality() {
        //GIVEN
        User user1 = new User("Adam", "Eden", 27);
        User user2 = new User("Ronald", "Grim", 30);
        User user3 = new User("Ronald", "Grim", 30);
        Map<User, User> userMap = new HashMap<>();
        //WHEN
        userMap.put(user1, user1);
        userMap.put(user2, user2);
        userMap.put(user3, user3);
        //THEN
        Assertions.assertTrue(userMap.containsKey(user1));
        Assertions.assertTrue(userMap.containsKey(user2));
        Assertions.assertTrue(userMap.containsKey(user3));
        Assertions.assertEquals(userMap.get(user2), userMap.get(user3));
    }
}
