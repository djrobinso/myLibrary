/**
 * 
 */
package library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;



//@RestController
@Controller
@RequestMapping("/")
public class PatronController {
	
	@Autowired
	private PatronRepository patronRepository;
	
	/**
	 * newPatron form creates new patron object and returns the web page content
	 * @return the name of the web page
	 * */
	/***
	@RequestMapping("/newPatron")
	public String newPatronForm(Map <String, Object> model) {
		Patron patron = new Patron();
		model.put("patron", patron);
		return "newPatron";
	}
	**/
	/**
	 * submitNewPatron will take you to the confirmation page
	 * */
	@GetMapping("/newPatron")
	public String newPatronForm(Model model) {
		model.addAttribute("patron",new Patron());
		return "newPatron";
	}
	
	/**
	 * newPatroSubmit takes in the form , submit it and then takes you to the confirmation page
	 * @return the view "confirmation" the confirmation age to the user
	 * */
	@PostMapping("/newPatron")
	public String newPatronSubmit(@ModelAttribute Patron patron) {
		patronRepository.save(patron);
		return "confirmation";
	}
	
	
}//end of Patron Controller
