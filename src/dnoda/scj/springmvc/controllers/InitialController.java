package dnoda.scj.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitialController {
	@RequestMapping("/")
	public String initialPage(Model m){
		m.addAttribute("message", "welcome");
		
		return "index";
	}
}