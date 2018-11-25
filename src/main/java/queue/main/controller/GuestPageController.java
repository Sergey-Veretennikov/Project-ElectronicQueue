package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import queue.main.db.entities.Service;
import queue.main.service.availableservices.AvailableServicesList;
import queue.main.service.user.UserService;

import java.util.List;

@Controller
public class GuestPageController {
    private AvailableServicesList availableServicesList;

    @Autowired
    public void setAvailableServicesList(AvailableServicesList availableServicesList) {
        this.availableServicesList = availableServicesList;
    }

    @RequestMapping(value = "/guestpage", method = RequestMethod.GET)
    public String showAvailableServicesForGuest(Model model)
    {
        List<Service> allAvailableServices = availableServicesList.getAvailableServices();
        model.addAttribute("services", availableServicesList);
        return "guestpage";
    }
}
