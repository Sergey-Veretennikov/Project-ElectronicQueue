package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import queue.main.service.attendance.AttendanceService;

@Controller
public class UserPageController {

    private AttendanceService attendanceService;

    @Autowired
    public void setAttendanceService(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @RequestMapping(value = "/guestpage", method = RequestMethod.GET)
    public String showUserPage(Model model) {
        model.addAttribute("services", attendanceService.getAvailableAttendance());
        return "guestpage";
    }
}
