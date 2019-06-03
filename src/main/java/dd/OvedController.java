package dd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


	@Controller
	public class OvedController {
		private static final Logger logger = LoggerFactory.getLogger(OvedController.class);
		
		@GetMapping("/hello")
		public String hello() {
			logger.trace("Enter Hello");

		return "/hello";
		}
		
		@GetMapping("/guest")
		public String guestManager(
		@RequestParam(name = "user") String x,
		Model model) {
		model.addAttribute("userName", x);
		return "/guest";
		}

}
