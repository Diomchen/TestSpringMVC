package my.spring.service;

import my.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceBean {
    @Autowired
    private User user;
    public User createUser(String username,String password){
        System.out.println("Save user...");
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}
