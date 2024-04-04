package ru.lighterpro.service;

import ru.lighterpro.dao.UserDao;
import ru.lighterpro.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
