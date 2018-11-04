package my.spring.service;

import my.spring.UserServiceBean;
import my.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceBean userServiceBean ;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(User user){
        userServiceBean.createUser(user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("createSuccess");
        mav.addObject("user",user);
        return mav;
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

}
