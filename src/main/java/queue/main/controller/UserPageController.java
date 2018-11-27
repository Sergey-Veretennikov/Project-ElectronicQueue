package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserPageController {
    @RequestMapping(value = "/userpage", method = RequestMethod.GET)
    public String showUserPage(Model model) {
        return "userpage";
    }
}