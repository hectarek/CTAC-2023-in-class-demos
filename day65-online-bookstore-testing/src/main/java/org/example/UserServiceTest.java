package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {
    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testRegisterUser() {
        User user = new User("username", "password", "email@example.com");
        Assert.assertTrue(userService.registerUser(user));

        // Negative case
        Assert.assertFalse(userService.registerUser(user));

        // Edge case with empty string as username
        User emptyUser = new User("", "password", "email@example.com");
        Assert.assertFalse(userService.registerUser(emptyUser));
    }

    @Test
    public void testLoginUser() {
        User user = new User("username", "password", "email@example.com");
        userService.registerUser(user);

        Assert.assertNotNull(userService.loginUser("username", "password"));

        // Negative case
        Assert.assertNull(userService.loginUser("username", "wrongpassword"));
    }

    @Test
    public void testUpdateUserProfile() {
        User user = new User("username", "password", "email@example.com");
        userService.registerUser(user);

        Assert.assertTrue(userService.updateUserProfile(user, "newusername", "newpassword", "newemail@example.com"));

        // Negative case
        Assert.assertFalse(userService.updateUserProfile(user, "newusername", "password", "email@example.com"));

        // Edge case with empty string as new username
        Assert.assertFalse(userService.updateUserProfile(user, "", "password", "email@example.com"));
    }
}

