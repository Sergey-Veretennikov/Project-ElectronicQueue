package queue.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TalonController {

    @RequestMapping(value = "/sendTalon", method = RequestMethod.GET)
    public String getTalonInfo(@RequestParam(value = "serviceName", required = true) String name,@RequestParam(value = "talonNumber", required = true) Integer counter, Model model) {
        model.addAttribute("serviceName", name);
        model.addAttribute("talonNumber", counter);
        return "sendTalon";
    }

}
