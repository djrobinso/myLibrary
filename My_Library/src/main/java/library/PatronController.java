/**
 * 
 */
package library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import javax.validation.Valid;

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
	
	
	/**
	 * checkBookOut take in the ID number of the patron and then checks the book out to 
	 * that patron by changing the checkedOut value and adding the patron ID as the book borrower.
	 * It takes you from the homepage to the checkOut page
	 * @return the view of the page displaying the patron info
	 * **/
	@GetMapping("/CheckOut")
	public String checkBookOut(@RequestParam("enteredID") String enteredID, Model model) {
		model.addAttribute("patron", patronRepository.pullPatronData(enteredID));
		return "CheckOut";
	}
	
	/***
	 * getAllPatrons uses a model attribute creates the list of all the Patrons in the database 
	 * and returns them so the user can edit them selected Patron
	 * ***/
	@GetMapping("/editPatrons")
	public String getAllPatrons(Model model) {
		model.addAttribute("patrons", patronRepository.findAll());
		return "editPatrons";
	}
	
	/***
	 * 
	 * **/
	@PostMapping("/update/{ID_number}")
	public String getUpdateForm(@PathVariable("ID_number") String ID_number, @Valid Patron patron) {
		
		return "updatePatron";
	}
	
	/**
	 * 
	 * ***/
	@PostMapping("/delete/{ID_number}")
	public String updatePatron() {
		
		return "index";
	}
	
	
}//end of Patron Controller
