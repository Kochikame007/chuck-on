package spring.chuck.noris.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.chuck.noris.app.service.ChuckNorrisJoke;

@Controller
public class ChuckController {

	
	private ChuckNorrisJoke chuckJokes;
	
	public  ChuckController(ChuckNorrisJoke chuckJoke) {
		this.chuckJokes =chuckJoke;
	}
	
	@RequestMapping({"/",""})
	public String getJokes(Model model) {
		model.addAttribute("joke", chuckJokes.getJokes());
		return "chucknorris";
	}
	
}
