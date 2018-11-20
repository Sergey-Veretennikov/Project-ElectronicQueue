package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OperatorPageController {
    @RequestMapping(value = "/operatorpage", method = RequestMethod.GET)
    public String showOperatorPage(Model model) {
        return "operatorpage";
    }
}
