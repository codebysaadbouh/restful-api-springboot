package com.manage.user.service;
import java.util.*;
import com.manage.user.model.User;

public interface UserService {
    public List<User> getAllUser();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public User getUserById(int id);
}
