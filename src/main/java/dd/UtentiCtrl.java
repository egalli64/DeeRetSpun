package dd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtentiCtrl {
	
	@Autowired
	UtentiRepo repo;
	
	@GetMapping("/utente") //il file che deve gestire gli utenti in templates dovrà prendere utente come nome
	public String utenti(Model model) {
		model.addAttribute("utente", repo.findAll());
		return "/utente";
	}
	 
	//altri metodi da scrivere


}
