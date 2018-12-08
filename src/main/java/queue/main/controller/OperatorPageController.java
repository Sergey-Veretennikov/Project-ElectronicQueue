package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import queue.main.db.entities.UserInfo;
import queue.main.db.entities.Users;
import queue.main.service.UserService;

import java.security.Principal;

@Controller
public class OperatorPageController {

    private Users users;

    private UserInfo userInfo;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/operatorpage", method = RequestMethod.GET)
    public String showOperatorPage(Model model,
                                   @RequestParam(value = "action", required = false) String action,
                                   Principal principal) {
        if (users == null) {
            String name = principal.getName();
            users = (Users) userService.getUser(name);
            userInfo = users.getUserInfo();
        }
        model.addAttribute("userInfo", userInfo);
        switch (action == null ? "info" : action) {
            case "next":
                System.out.println("Next");
                break;
            case "done":
                System.out.println("Done");
                break;
            case "nextWithout":
                System.out.println("nextWithout");
                break;
            case "callAdmin":
                System.out.println("Call Admin");
                break;
        }
        return "operatorpage";
    }


}
