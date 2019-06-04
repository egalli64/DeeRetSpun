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
	UsersRepo repo;
	
	@GetMapping("/users") //il file che deve gestire gli utenti in templates dovrà prendere utente come nome
	public String utenti(Model model) {
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
	@GetMapping("/users/mod")
	public String restMod(@RequestParam int id, Model model) {
		Optional<Users> opt = repo.findById(id);
		if (opt.isPresent()) {
			model.addAttribute("users", opt.get());
		}
		return "/modifyPage";

	}
	@GetMapping("/users/canc")
	public String utenCanc(@RequestParam int id, Model model) {
		Optional<Users> opt=repo.findById(id);
		if(opt.isPresent()) {
			repo.deleteById(id);
			model.addAttribute("restaurants", repo.findAll());
		}
		return "/users";
	}
	


}
