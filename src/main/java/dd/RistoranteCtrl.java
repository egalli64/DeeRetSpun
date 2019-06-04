package dd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RistoranteCtrl {
	@Autowired
	RistoranteRepo repo;

	@GetMapping("/restaurants")
	public String ristorante(Model model) {
		model.addAttribute("restaurants", repo.findAll());
		return "/restaurants";
	}

	// metodo seguente ci serve a fare l'inserimento e anche sempre salvare,mi
	// ritorna il nome del file in templates
	@PostMapping("/insRes/Save")
	public String inserisci(@RequestParam int id, @RequestParam String name, @RequestParam String address,
			@RequestParam int place, @RequestParam String typeOfCucina, @RequestParam String feedback,
			@RequestParam String priceRange, Model model) {
		Ristorante insRes = new Ristorante(id, name, address, place, typeOfCucina, feedback, priceRange);
		repo.save(insRes);
		model.addAttribute("restaurants", repo.findAll());
		return "/restaurants";
	}

	@PostMapping("/modRes")
	public String modifica(@RequestParam int id, @RequestParam String name, @RequestParam String address,
			@RequestParam int place, @RequestParam String typeOfCucina, @RequestParam String feedback,
			@RequestParam String priceRange, Model model) {
		Ristorante insRes = new Ristorante(id, name, address, place, typeOfCucina, feedback, priceRange);
		repo.save(insRes);
		model.addAttribute("restaurants", repo.findAll());
		return "/restaurants";
	}

	@GetMapping("/rest/mod")
	public String restMod(@RequestParam int id, Model model) {
		Optional<Ristorante> opt = repo.findById(id);
		if (opt.isPresent()) {
			model.addAttribute("restaurant", opt.get());
		}
		return "/paginaModifica";

	}
}
