package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import queue.main.service.UserService;

@Controller
public class AddUserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String registerUser(@RequestParam(value = "login", required = true) String login,
                               @RequestParam(value = "password", required = true) String password,
                               @RequestParam(value = "role", required = true) String role,
                               Model model) {
        userService.addUser(login, password, role);
        return "registrationpage";
    }
}
