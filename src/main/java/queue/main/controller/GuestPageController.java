package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GuestPageController {
    @RequestMapping(value = "/guestpage", method = RequestMethod.GET)
    public String showAvailableServicesForGuest(Model model)
    {

        return "guestpage";
    }
}
