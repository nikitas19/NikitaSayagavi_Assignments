package springmvc.assignment.q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showLoginPage() {
		return "index";
	}

	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	//@ResponseBody
	public String handleLoginRequest( ) {
		return "helloWorld";
		
	}
}