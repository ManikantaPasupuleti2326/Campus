package com.example.campuscare.Services;

import com.example.campuscare.Entity.User;
import com.example.campuscare.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void saveUser(User user) {
        userRepository.save(user);
    }


    public List<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    public List<User> getAllTechnicians() {
        return userRepository.findByRole(User.Role.TECHNICIAN);
    }


    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}