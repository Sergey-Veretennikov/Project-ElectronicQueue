package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WindowMonitorController {
    @RequestMapping(value = "/windowMonitor", method = RequestMethod.GET)
    public String showWindowMonitor(Model model) {
        return "windowMonitor";
    }
}
