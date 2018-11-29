package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeadOperatorPageController {
    @RequestMapping(value = "/headoperatorspage", method = RequestMethod.GET)
    public String showHeadOperatorsPage(Model model) {
        return "headoperatorspage";
    }
}
