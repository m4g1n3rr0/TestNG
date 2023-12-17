package TestForTestNG.TestForTestNG.service;


import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean authenticate(String login, String password) {
    	
        return "valid_login".equals(login) && "valid_password".equals(password);
    
    }

}

