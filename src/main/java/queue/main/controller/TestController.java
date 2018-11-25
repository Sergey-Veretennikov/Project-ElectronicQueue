package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import queue.main.service.UserService;

@Controller
public class TestController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/headoperatorspage", method = RequestMethod.GET)
    public String showHeadOperatorsPage(Model model) {
        return "headoperatorspage";
    }

    @RequestMapping(value = "/logoutpage", method = RequestMethod.GET)
    public String showAnyUserPage(Model model) {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        for (GrantedAuthority auth : authentication.getAuthorities()) {
            if ("ROLE_ADMIN".equals(auth.getAuthority())) {
                model.addAttribute("role", "ROLE_ADMIN");
            }
        }
        return "anyuserpage";
    }

    @RequestMapping(value = "/adminpage", method = RequestMethod.GET)
    public String showAdminPage(Model model) {
        return "adminpage";
    }

    @RequestMapping(value = "/operatorpage", method = RequestMethod.GET)
    public String showOperatorPage(Model model) {
        return "operatorpage";
    }

    @RequestMapping(value = "/registrationpage", method = RequestMethod.GET)
    public String showRegister(Model model) {
        return "registrationpage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm(
            @RequestParam(value = "error", required = false) String error,
            Model model) {
        model.addAttribute("loginError", error);
        return "login";
    }
}
