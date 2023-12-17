package TestForTestNG.TestForTestNG;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.request.*;
import org.springframework.test.web.servlet.result.*;

@SpringBootTest
public class AppTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeClass
    public void setup() {
       
    	
    	
    }

    @Test
    public void testLoginPage() throws Exception {
       
    	mockMvc.perform(MockMvcRequestBuilders.get("/login-page"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.view().name("login"));
   
    }

    @Test
    public void testLoginSuccess() throws Exception {
      
    	mockMvc.perform(MockMvcRequestBuilders.post("/login").param("login", "valid_login").param("password", "valid_password"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.view().name("login"))
               .andExpect(MockMvcResultMatchers.model().attribute("successMessage", true));
   
    }
    
}



