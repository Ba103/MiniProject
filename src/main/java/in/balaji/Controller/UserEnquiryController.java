package in.balaji.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserEnquiryController {
	
	@GetMapping("'login")
	public String login() {
		return "login";
	}

}
