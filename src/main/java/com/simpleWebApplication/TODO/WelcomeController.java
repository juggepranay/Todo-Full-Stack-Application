package com.simpleWebApplication.TODO;




import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("name")
public class WelcomeController {
	
//	@Autowired
//	private AuthenticationService Authenticate;
//	

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String gotowelcome(ModelMap model){
		model.put("name","pranay");
		return "welcomepage";
	}
	
	

	
	
	
	
	
	
	
	
	
//	@RequestMapping(value="login",method=RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String uname,@RequestParam String psw,ModelMap model){
//		if(Authenticate.checkCredentails(uname,psw)) {
//			 model.put("name",uname);
//			  return "welcomepage";
//			
//		}
//		 model.put("errorMessage", "Invalid Credentials");
//		 return "Login";
//		  
//		}
	
	
	
	
	

}
