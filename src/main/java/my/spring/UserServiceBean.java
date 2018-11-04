package my.spring;

import my.spring.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceBean {
    public void createUser(User user){
        System.out.println("Save user...");
    }
}
