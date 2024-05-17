package com.example.splash_learn;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserInfoTest {

    private UserInfo userInfo;

    @Before
    public void setUp() throws Exception {
        // Initialize userInfo with test data before each test
        userInfo = new UserInfo("test_user", "password123", "Test College", "test@example.com");
    }

    @After
    public void tearDown() throws Exception {
        // Clean up after each test
        userInfo = null;
    }

    @Test
    public void testGetUserName() {
        assertEquals("test_user", userInfo.getUser_name());
    }

    @Test
    public void testSetUserName() {
        userInfo.setUser_name("new_user");
        assertEquals("new_user", userInfo.getUser_name());
    }

    @Test
    public void testGetPassword() {
        assertEquals("password123", userInfo.getPassword());
    }

    @Test
    public void testSetPassword() {
        userInfo.setPassword("new_password");
        assertEquals("new_password", userInfo.getPassword());
    }

    @Test
    public void testGetCollegeName() {
        assertEquals("Test College", userInfo.getCollege_name());
    }

    @Test
    public void testSetCollegeName() {
        userInfo.setCollege_name("New College");
        assertEquals("New College", userInfo.getCollege_name());
    }

    @Test
    public void testGetEmail() {
        assertEquals("test@example.com", userInfo.getEmail());
    }

    @Test
    public void testSetEmail() {
        userInfo.setEmail("new@example.com");
        assertEquals("new@example.com", userInfo.getEmail());
    }

    @Test
    public void testEmptyConstructor() {
        UserInfo emptyUserInfo = new UserInfo();
        emptyUserInfo.setUser_name("empty_user");
        emptyUserInfo.setPassword("empty_password");
        emptyUserInfo.setCollege_name("Empty College");
        emptyUserInfo.setEmail("empty@example.com");

        assertEquals("empty_user", emptyUserInfo.getUser_name());
        assertEquals("empty_password", emptyUserInfo.getPassword());
        assertEquals("Empty College", emptyUserInfo.getCollege_name());
        assertEquals("empty@example.com", emptyUserInfo.getEmail());
    }
}
