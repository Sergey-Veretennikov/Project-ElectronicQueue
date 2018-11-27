package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TerminalController {
    @RequestMapping(value = "/terminal", method = RequestMethod.GET)
    public String showTerminalPage(Model model) {
        return "terminal";
    }

    @RequestMapping(value = "/sendTalon", method = RequestMethod.GET)
    public String showSendTalonPage(Model model) {
        return "sendTalon";
    }
}
