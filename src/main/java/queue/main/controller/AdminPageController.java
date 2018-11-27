package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminPageController {
    @RequestMapping(value = "/adminpage", method = RequestMethod.GET)
    public String showAdminPage(Model model) {
        return "adminpage";
    }
}
