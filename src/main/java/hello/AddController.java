package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {

    private String param;

    @PostMapping("/add")
    public String addPost(
            @RequestParam(name = "user", required = false, defaultValue = "lUser") String user,
            Model model) {
        param = user;
        model.addAttribute("user", user);
        return "add";
    }

    @GetMapping("/add")
    public String addGet(Model model) {
        model.addAttribute("user", param);
        return "add";
    }

}
