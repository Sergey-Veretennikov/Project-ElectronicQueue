package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import queue.main.service.UserService;

@Controller
public class RegistrationController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String registerUser(@RequestParam(value = "name", required = true) String name,
                               @RequestParam(value = "surname", required = true) String surname,
                               @RequestParam(value = "dateofBirth", required = true) String dateofBirth,
                               @RequestParam(value = "contact", required = true) String contact,
                               @RequestParam(value = "login", required = true) String login,
                               @RequestParam(value = "password", required = true) String password,
                               @RequestParam(value = "idRole", required = true) String idRole,
                               @RequestParam(value = "isActive", required = true) String isActive,
                               @RequestParam(value = "registrationFailed", required = false) String registrationFailed,
                               Model model) {
        if (!(userService.addUser(name.trim(), surname.trim(), dateofBirth, contact.trim(), login.trim()
                , password.trim(), idRole, isActive))) {
            registrationFailed = "registrationFailed";
            model.addAttribute("registrationFailed", registrationFailed);
        }
        return "registrationpage";
    }
}
