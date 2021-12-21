package toyPackage.controllers.implementations;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import toyPackage.controllers.interfaces.HelloController;

@Controller
public class HelloControllerImpl implements HelloController {

    @Override
    @GetMapping("hello")
    public String helloMethod() {
        String hello = "Hello World!";
        return "test";
    }

    @Override
    @GetMapping("hello2")
    public ModelAndView helloMethod2() {
        String hello = "Hello World!";
        String hell = "uhsuohd";
        return new ModelAndView("test","message", hello);
    }

    @Override
    @GetMapping("hello3")
    public String helloMethod3(Model model) {
        String hello = "Hello World!";
        String hell = "uhsuohd";
        model.addAttribute("message", hello);
        model.addAttribute("hell", hell);
        return "test";
    }
}
