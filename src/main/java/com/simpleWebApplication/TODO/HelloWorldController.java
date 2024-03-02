package com.simpleWebApplication.TODO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HelloWorldController {
	
	@RequestMapping("/helloworld")
	public String helloworld() {
		
//		StringBuilder st=new StringBuilder();
//		st.append("<html>");
//		st.append("<body>");
//		st.append("<h1> hello world this is a message using String Builder </h1>");
//		st.append("</body");
//		st.append("</html>");
//		
		
		return "helloworld";
	}

}
