/**
 * 
 */
package library;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/")
public class BookController {

	@Autowired 
	private LibraryRepository libraryRepository;
	
	/**
	 * newBookForm  creates new book  object and returns the web page content
	 * */
	@GetMapping("/newBook")
	public String newBookForm(Model model) {
		model.addAttribute("book", new Book());
		return "newBook";
	}
	
	/**
	 * after creating the new book take them to the confirmation page
	 * */
	@PostMapping("/newBook")
	public String submitNewBook(@ModelAttribute Book book) {
		return "bookConfirm";
	}
	
	
	
	//check new book out
	
	

}
