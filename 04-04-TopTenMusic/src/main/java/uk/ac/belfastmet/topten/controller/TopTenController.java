package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.topten.service.TopTenService;

@Controller
@RequestMapping
public class TopTenController {

	@GetMapping()
	public String homePage() {

		return "Index";
	}

	@GetMapping("/Artist")
	public String artistPage(Model model) {

		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Artist");
		model.addAttribute("Artist", topTenService.getArtistTopTen());

		return "artistTopTen";
	}

	@GetMapping("/Album")
	public String albumPage(Model model) {

		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Album");
		model.addAttribute("Album", topTenService.getAlbumTopTen());

		return "albumTopTen";
	}
}
