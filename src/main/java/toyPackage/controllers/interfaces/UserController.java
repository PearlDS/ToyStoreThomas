package toyPackage.controllers.interfaces;

import org.springframework.ui.Model;
import toyPackage.data.User;

import javax.servlet.http.HttpSession;

public interface UserController {

    String login (Model model, HttpSession httpSession);
    String actuallyLogin(User userReceived, HttpSession session);
    String logout (HttpSession session);

}
