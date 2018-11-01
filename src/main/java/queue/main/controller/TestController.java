package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import queue.main.service.TestService;

@Controller
public class TestController {
    private TestService testService;

    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/testList", method = RequestMethod.GET)
    public String getStudentList(Model model) {
        model.addAttribute("testData", testService.getTestData());
        return "testList";
    }
}
