package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.topten.service.TopTenService;

/**
 * 
 * @author MCK18137665
 *
 */
@Controller
@RequestMapping
public class TopTenController {

	/**
	 * 
	 * @return homePage html file
	 */
	@GetMapping()
	public String homePage() {

		return "Index";
	}

	/**
	 * 
	 * @param model artist page
	 * @return top ten artists html file
	 */
	@GetMapping("/Artist")
	public String artistPage(Model model) {

		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Artist");
		model.addAttribute("Artist", topTenService.getArtistTopTen());

		return "artistTopTen";
	}

	/**
	 * 
	 * @param model album page
	 * @return top ten albums html file
	 */
	@GetMapping("/Album")
	public String albumPage(Model model) {

		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Album");
		model.addAttribute("Album", topTenService.getAlbumTopTen());

		return "albumTopTen";
	}
}
