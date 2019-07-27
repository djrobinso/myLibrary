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
	 * submitNewBook after creating the new book take them to the confirmation page
	 * */
	@PostMapping("/newBook")
	public String submitNewBook(@ModelAttribute Book book) {
		book.setCheckIn_Out(0);
		libraryRepository.save(book);
		return "bookConfirm";
	}
	
	/**
	 * checkInBook takes in the barcode of the book and checks it back into the library
	 * @return view with the information of the book and a confirmation to check in another 
	 * or return to the homepage
	 * ***/
	@RequestMapping("/CheckIn")
	public String checkBookIn(@RequestParam("checkInBarcode") String barcode, Model model) {
		Book checkedInBook = libraryRepository.checkBookIn(barcode);
		//change the book to be checked back into the library
		checkedInBook.setCheckIn_Out(0);
		model.addAttribute("checkedInBook", checkedInBook);
		return "CheckIn";
	}
	
	/**
	 * getAllBooks creates the model attribute of all the books within the library database so that
	 * the user can edit the selected book info
	 * ***/
	@GetMapping("/editBooks")
	public String getAllBooks(Model model) {
		model.addAttribute("books", libraryRepository.findAll() );
		return "editBooks";
	}
	
	

}
