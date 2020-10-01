package crud.controller;

import crud.model.User;
import crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String start(){
        return "index";
    }

    @GetMapping(value = "/user")
    public String userPage(Principal principal, ModelMap modelMap) {
        User user = (User) userService.loadUserByUsername(principal.getName());
        modelMap.addAttribute(user);
        return "user";
    }
}
