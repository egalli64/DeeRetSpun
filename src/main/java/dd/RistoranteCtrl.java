package dd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RistoranteCtrl {
	@Autowired
	RistoranteRepo repo;

	@GetMapping("/restaurants")
	public String ristorante(Model model) {
		model.addAttribute("restaurants", repo.findAll());
		return "/restaurants";
	}

}
