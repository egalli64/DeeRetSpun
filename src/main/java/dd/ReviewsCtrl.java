package dd;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsCtrl {
	private final static Logger log = LoggerFactory.getLogger(ReviewsCtrl.class);

	@Autowired
	ReviewsRepo repo;
	@Autowired
	RestaurantRepo repoRest;

	@GetMapping("/reviews")
	public String recensione(Model model) {
		log.trace("enter recensione");
		model.addAttribute("reviews", repo.findAll());
		return "/reviews";
	}

	@PostMapping("/insReviews/Save")
	public String inserisci(@RequestParam int reviewId, @RequestParam int restaurantId, @RequestParam int userId,
			@RequestParam String review, @RequestParam int vote, @RequestParam int miPiace,
			@RequestParam int nonMiPiace, Model model) {
		Reviews insRev = new Reviews(reviewId, restaurantId, userId, review, vote, miPiace, nonMiPiace);
		repo.save(insRev);
		model.addAttribute("reviews", repo.findAll());
		return "/reviews";
	}

	@PostMapping("/modReviews")
	public String modifica(@RequestParam int reviewId, @RequestParam int restaurantId, @RequestParam int userId,
			@RequestParam String review, @RequestParam int vote, @RequestParam int miPiace,
			@RequestParam int nonMiPiace, Model model) {
		Reviews insRev = new Reviews(reviewId, restaurantId, userId, review, vote, miPiace, nonMiPiace);
		repo.save(insRev);
		model.addAttribute("reviews", repo.findAll());
		return "/reviews";
	}

	@GetMapping("/reviews/mod")
	public String revMod(@RequestParam int reviewId, Model model) {
		log.trace("enter revMod");
		Optional<Reviews> opt = repo.findById(reviewId);
		if (opt.isPresent()) {
			model.addAttribute("reviews", opt.get());
		}

		return "/modifyReviews";
	}

	@GetMapping("/reviews/canc")
	public String reviewsCanc(@RequestParam int reviewId, Model model) {
		Optional<Reviews> opt = repo.findById(reviewId);
		if (opt.isPresent()) {
			repo.deleteById(reviewId);
			model.addAttribute("reviews", repo.findAll());
		}

		return "/reviews";
	}

	@GetMapping("/reviews/ricercaRist")
	public String cercaPerRistoranti(@RequestParam int restaurantId, Model model) {
		Optional<Restaurant>opt=repoRest.findById(restaurantId);//vado a cercare tra i ristoranti se c'è un Id corrispondente a restaurantId
		if(opt.isPresent()) {
			 
		}
		

		return "/restaurantReview";
	}
}
