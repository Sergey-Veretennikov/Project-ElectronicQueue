package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MonitorController {
    @RequestMapping(value = "/monitor", method = RequestMethod.GET)
    public String showMonitor(Model model) {
        return "monitor";
    }
}
