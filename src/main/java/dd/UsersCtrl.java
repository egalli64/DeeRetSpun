package dd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersCtrl {
	
	@Autowired
	UserRepo repo;
	
	@GetMapping("/users") //il file che deve gestire gli utenti in templates dovrà prendere utente come nome
	public String utente(Model model) {
		model.addAttribute("users", repo.findAll());
		return "/users";
	}
	 
	
	@PostMapping("/insUsers/Save")
	public String inserisci(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String reliability, @RequestParam int reviews, Model model) {
		Users insUten = new Users(firstName, lastName, reliability, reviews);
		repo.save(insUten);
		model.addAttribute("users", repo.findAll());
		return "/users";
	}
	
	@PostMapping("/modUser")
	public String modifica(@RequestParam int userId,@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String reliability, @RequestParam int reviews, Model model) {
		Users insUten = new Users(userId,firstName, lastName, reliability, reviews);
		repo.save(insUten);
		model.addAttribute("users", repo.findAll());
		return "/users";
	}
	@GetMapping("/user/mod")
	public String usersMod(@RequestParam int userId, Model model) {
		Optional<Users> opt = repo.findById(userId);
		if (opt.isPresent()) {
			model.addAttribute("users", opt.get());
		}
		return "/modifyUser";

	}
	@GetMapping("/user/canc")
	public String userCanc(@RequestParam int userId, Model model) {
		Optional<Users> opt=repo.findById(userId);
		if(opt.isPresent()) {
			repo.deleteById(userId);
			model.addAttribute("users", repo.findAll());
		}
		return "/users";
	}
	


}
