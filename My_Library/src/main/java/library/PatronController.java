/**
 * 
 */
package library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Deyonta
 *
 */
@Controller
@RequestMapping("/")
public class PatronController {
	
	@Autowired
	private PatronRepository patronRepository;
	
	/**
	 * newPatron form creates new patron object and returns the web page content
	 * */
	
	@GetMapping("/newPatron")
	public String newPatronForm(Map <String, Object> model) {
		Patron patron = new Patron();
		model.put("patron", patron);
		return "newPatron";
	}
}
