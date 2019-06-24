/**
 * 
 */
package library;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import library.Book;


/**
 * @author Deyonta
 *
 */
public interface LibraryRepository extends CrudRepository<Book, Integer>{
	
	/**
	 * Query to check book in
	 * 
	**/
	@Query("SELECT * FROM libraryData WHERE FIND_IN_SET(left(barcode,7), scannedBarcode )> 0;")
	Book checkBookIn(String scannedBarcode);
}
