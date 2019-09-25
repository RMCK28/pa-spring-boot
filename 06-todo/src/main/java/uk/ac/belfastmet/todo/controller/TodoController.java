package uk.ac.belfastmet.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.todo.service.TodoService;

/**
 * Homepage
 * 
 * @author MCK18137665
 *
 */

@Controller
@RequestMapping
public class TodoController {

	@Autowired
	private TodoService todoService;

	@GetMapping()
	public String homePage() {

		return "index";
	}

	/**
	 * Method for first list
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/firstlist")
	public String firstListPage(Model model) {

		todoService.getNumberOfTasks();
		model.addAttribute("title", "List No. 1");
		model.addAttribute("firstlist", todoService.getNumberOfTasks());
		return "firstlist";

	}

	/**
	 * 2nd list of tasks
	 * 
	 * @param 2nd model
	 * @return
	 */
	@GetMapping("/secondlist")
	public String secondListPage(Model model) {

		todoService.getNumberOfTasks();
		model.addAttribute("subtitle", "List No.2");
		model.addAttribute("secondlist", todoService.getNumberOfTasks());
		return "secondlist";

	}
}

//	/**
//	 * 
//	 * 
//	 * @param model
//	 * @return
//	 */
//
//	@GetMapping("/thirdList")
//	public String thirdListPage(Model model) {
//		TodoService todoService = new TodoService();
//		ArrayList taskList = todoService.getList();
//		model.addAttribute("taskList", taskList);
//
//		return "thirdList";
//	}
//	
//}
