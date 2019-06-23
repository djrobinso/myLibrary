/**
 * 
 */
package library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Deyonta
 *
 */
public class BookController {
	
	//get the info from the user interface and then check it back into the library database
	//returns the book information with a confirmation message
	@GetMapping("/CheckIn")
	public @ResponseBody String proccessBookIn(@RequestParam String scannedBarcode ) {
		
		return null;
	}
	
	//Add New Book to database

}
