package ru.lighterpro.service;

import org.junit.jupiter.api.Test;
import ru.lighterpro.model.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void getAll() {
        List<User> actual = userService.getAll();
        assertEquals(3, actual.size());
    }
}