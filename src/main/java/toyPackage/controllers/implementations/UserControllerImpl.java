package toyPackage.controllers.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import toyPackage.controllers.interfaces.UserController;
import toyPackage.data.User;
import toyPackage.services.interfaces.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;


    @Override
    @GetMapping("/loginPage")
    public String login(Model model, HttpSession httpSession) {
        if (httpSession.getAttribute("currentUser")!=null)
            return "redirect:toys2";
        model.addAttribute("user", new User("","",null));
        return "login";
    }

    @Override
    @PostMapping("/login2")
    public String actuallyLogin(@ModelAttribute("user") User userReceived, HttpSession session) {
        System.out.println(userReceived.getUserName());
        System.out.println(userReceived.getPassWord());
        User user = userService.getUserByUserNameAndPassWord(userReceived.getUserName(), userReceived.getPassWord());

        if(user!= null){
            session.setAttribute("currentUser", user.getUserName());
            return "redirect:toys2";
        }else
            return "redirect:loginPage";
    }

    @Override
    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.setAttribute("currentUser", null);
        return "redirect:loginPage ";
    }
}
