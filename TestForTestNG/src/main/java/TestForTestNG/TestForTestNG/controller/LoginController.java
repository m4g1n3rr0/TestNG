package TestForTestNG.TestForTestNG.controller;
import TestForTestNG.TestForTestNG.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private LoginService LoginService;

    @RequestMapping("/login-page")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String login, String password, Model model) {
       
    	if (LoginService.authenticate(login, password)) {
         
        	model.addAttribute("successMessage", true);
        
        }
        
    	return "login";
    
    }

}
