package ru.lighterpro.dao;

import ru.lighterpro.model.User;

import java.util.List;

public class UserDao {
    public List<User> findAll() {
        return List.of(
                new User(13, "ivan"),
                new User(37, "sveta"),
                new User(4, "danil")
        );
    }
}
