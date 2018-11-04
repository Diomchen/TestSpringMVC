package my.spring;

import my.spring.domain.User;
import my.spring.service.UserServiceBean;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceBean userServiceBean ;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(User user , @RequestParam("username")String username , @RequestParam("password")String password){

        user = userServiceBean.createUser(username,password);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("createSuccess");
        mav.addObject("user",user);
        System.out.println(user.getUsername()+"---"+user.getPassword());
        return mav;
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

}
