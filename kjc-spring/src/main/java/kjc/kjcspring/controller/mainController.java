package kjc.kjcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("data", "�ȳ�~~~~");
		
		return "home";
	}
	
}
