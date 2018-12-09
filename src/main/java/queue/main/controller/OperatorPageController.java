package queue.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import queue.main.db.entities.Queue;
import queue.main.db.entities.UserInfo;
import queue.main.db.entities.Users;
import queue.main.service.UserService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

@Controller
public class OperatorPageController {

    private Users users;
    private UserInfo userInfo;
    private Queue queue;
    private Integer count = 0;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/operatorpage", method = RequestMethod.GET)
    public String showOperatorPage(Model model,
                                   @RequestParam(value = "action", required = false) String action,
                                   Principal principal) {
//        Если зашли в первый раз после login
        if (users == null) {
            String name = principal.getName();
            users = userService.getUser(name);
            userInfo = users.getUserInfo();
            queue = userService.getQueue(false);
        }
        model.addAttribute("userInfo", userInfo);
        model.addAttribute("admin", " ");

//        Смотрим что пришло от оператора
        switch (action == null ? "info" : action) {
            case "next":
//                queue = userService.getQueue("false");
//                userService.add(queue);
                queue = new Queue();
                break;
            case "done":
                count += 1;
                if(queue != null){
                    queue.setDone(true);
//                    userService.updateQueue(queue);
                }
                break;
            case "nextWithout":
//                userService.getQueue(false);
                queue.setDone(false);
                break;
            case "callAdmin":
                model.addAttribute("admin","Администратор позван");
                break;
        }
        model.addAttribute("queue",queue);;
        model.addAttribute("count", count);
        return "operatorpage";
    }

    @RequestMapping(value = "/operatorpageajax", method = RequestMethod.GET)
    public void ajaxUpdate(HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        response.setCharacterEncoding("UTF-8");
        queue = userService.getQueue(false);
        if (queue != null) {
            response.getWriter().write("Есть новый посетитель. Нажмите кнопку следующий");
        }
        else {
            response.getWriter().write("Нет новыx посетитель");
        }
    }
}
