package com;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testIdCard_evenNumber_returnsMale() {
        String result = userService.idCard(2);
        assertEquals("男", result);
    }

    @Test
    public void testIdCard_oddNumber_returnsFemale() {
        String result = userService.idCard(3);
        assertEquals("女", result);
    }

    @Test
    public void testIdCard_zero_returnsMale() {
        String result = userService.idCard(0);
        assertEquals("男", result);
    }

    @Test
    public void testIdCard_negativeEven_returnsMale() {
        String result = userService.idCard(-4);
        assertEquals("男", result);
    }

    @Test
    public void testIdCard_negativeOdd_returnsFemale() {
        String result = userService.idCard(-3);
        assertEquals("女", result);
    }

    @Test
    public void testIdCard_largeEven_returnsMale() {
        String result = userService.idCard(100000);
        assertEquals("男", result);
    }

    @Test
    public void testIdCard_largeOdd_returnsFemale() {
        String result = userService.idCard(99999);
        assertEquals("女", result);
    }
}
