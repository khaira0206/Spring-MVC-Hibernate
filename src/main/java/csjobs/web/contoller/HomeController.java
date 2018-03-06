package csjobs.web.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping({"/index.html","/home.html"})
	public String home(ModelMap models){
		
		models.put("user", "khaira");
		return "home";
	}
}
