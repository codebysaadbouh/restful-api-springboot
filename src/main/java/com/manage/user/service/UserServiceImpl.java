package com.manage.user.service;

import com.manage.user.dao.UserRepository;
import com.manage.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAllUser() {
        List<User> listUser = new ArrayList<User>();

        for(User user : repository.findAll()){
            listUser.add(user);
        }
        return listUser;
    }

    @Override
    public void addUser(User user) {
        repository.save(user);
    }

    @Override
    public void updateUser(User user) {
        repository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        repository.deleteById(id);
    }

    @Override
    public User getUserById(int id) {
        return repository.findById(id).get();
    }
}
