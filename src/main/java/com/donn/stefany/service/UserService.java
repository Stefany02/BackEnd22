/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donn.stefany.service;


import com.donn.stefany.interfaces.IUserService;
import com.donn.stefany.model.User;
import com.donn.stefany.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    
    @Autowired
    public UserRepository userRepo;

    @Override
    public void saveUser (User user) {
            userRepo.save(user);
    }
    
    @Override
    public List<User> getUsers () {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser (Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User findUserById (Long id) {
        return userRepo.findById(id).orElse(null);
    }
    
    @Override
    public User updateUser (User user, Long user_id) {
        Optional<User> localUser = userRepo.findById(user_id);
        User usr = null;
        if (localUser.isPresent()) {
            usr = localUser.get();
            usr.setEmail(user.getEmail());
            usr.setUsername(user.getUsername());
            usr.setPassword(user.getPassword());
            usr = userRepo.save(usr);
        }
        return usr;
    }
    
}