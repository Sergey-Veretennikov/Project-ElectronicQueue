package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationPageController {
    @RequestMapping(value = "/registrationpage", method = RequestMethod.GET)
    public String showRegister(Model model) {
        return "registrationpage";
    }
}
