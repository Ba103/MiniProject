package in.balaji.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InderxController {
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}

}
