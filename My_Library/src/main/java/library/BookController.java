/**
 * 
 */
package library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Deyonta
 *
 */

import library.Book;
import library.LibraryRepository;


@Controller
@RequestMapping(path="/")
public class BookController {
	

	@Autowired 
	private LibraryRepository libraryRepository;
	
	
	//get the info from the user interface and then check it back into the library database
	//returns the book information with a confirmation message
	@GetMapping("/CheckIn")
	public @ResponseBody String proccessBookIn(@RequestParam String scannedBookBarcode ) {
		
		//check book in with the method to the interface
		Book pulledBookData = libraryRepository.checkBookIn(scannedBookBarcode);
		
		return null;
	}
	
	//Add New Book to database
	
	
	//check new book out
	
	

}
