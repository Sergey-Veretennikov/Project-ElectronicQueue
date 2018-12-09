package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import queue.main.service.attendance.AttendanceService;

import java.util.Map;

@Controller
public class TerminalController {

    private static int talonCounter = 0;

    @RequestMapping(value = "/terminal", method = RequestMethod.GET)
    public String showTerminalPage(Model model) {
        return "terminal";
    }

    /*@RequestMapping(value = "/sendTalon", method = RequestMethod.GET)
    public String showSendTalonPage(Model model) {
        return "sendTalon";
    }*/

    private AttendanceService attendanceService;

    @Autowired
    public void setAttendanceService(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @RequestMapping(value = "/talon", method = RequestMethod.POST)
    public ModelAndView getQueueNumber(@RequestParam(value = "name", required = true) String name, ModelMap model) {
        model.addAttribute("serviceName", name);
        model.addAttribute("talonNumber", talonCounter);
        talonCounter++;
        return new ModelAndView("redirect:/sendTalon", model);
    }


}
