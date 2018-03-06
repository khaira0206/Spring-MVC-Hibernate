package csjobs.web.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import csjobs.model.User;
import csjobs.model.dao.UserDao;

@Controller
public class UserController {

	@Autowired 
	private UserDao userdao;
	@RequestMapping("/user/list.html")
	public String list( ModelMap models){
		
		//get all the users from database and pass them to thr jsp
		List<User> users = userdao.getAllUsers();
		models.put("users", users);
		return "user/list";
	}
}
