package dd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ReviewsCtrl {
	
	@Autowired
	ReviewsRepo repo;

	@GetMapping("/reviews")
	public String ristorante(Model model) {
		model.addAttribute("reviews", repo.findAll());
		return "/reviews";
	}
	
	@PostMapping("/insReviews/Save")
	public String inserisci(@RequestParam int reviewId, @RequestParam int restaurantId,
			@RequestParam int userId, @RequestParam String review, @RequestParam int miPiace,
			@RequestParam int nonMiPiace, Model model) {
		Reviews insRev = new Reviews(reviewId,restaurantId, userId, review, miPiace, nonMiPiace);
		repo.save(insRev);
		model.addAttribute("reviews", repo.findAll());
		return "/reviews";
	}
	
	@PostMapping("/modReviews")
	public String modifica(@RequestParam int reviewId, @RequestParam int restaurantId,
			@RequestParam int userId, @RequestParam String review, @RequestParam int miPiace,
			@RequestParam int nonMiPiace, Model model) {
		Reviews insRev = new Reviews(reviewId,restaurantId, userId, review, miPiace, nonMiPiace);
		repo.save(insRev);
		model.addAttribute("reviews", repo.findAll());
		return "/reviews";
	}
	@GetMapping("/reviews/mod")
	public String restMod(@RequestParam int userId, Model model) {
		Optional<Reviews> opt = repo.findById(userId);
		if (opt.isPresent()) {
			model.addAttribute("reviews", opt.get());
		}
		
		return "/modifyReviews";
	}
	
	@GetMapping("/reviews/canc")
	public String reviewsCanc(@RequestParam int userId, Model model) {
		Optional<Reviews> opt = repo.findById(userId);
		if (opt.isPresent()) {
			repo.deleteById(userId);
			model.addAttribute("reviews", opt.get());
		}
		
		return "/reviews";
	}
	
	@GetMapping("/reviews/ricercaRist")
	public String cercaPerRistoranti(@RequestParam int restaurantId, Model model) {
		
		return "/reviews";
	}
}
