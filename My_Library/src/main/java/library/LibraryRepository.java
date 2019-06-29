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
	 * Query to check book in by the barcode and search the database via the barcode
	 * and pull that information
	 * @param the scanned barcode from the book
	 * @return the found book in the database
	**/
	@Query(value = "SELECT * FROM bookData WHERE binary barcode = scannedBarcode", nativeQuery=true)
	public Book checkBookIn(String scannedBarcode);
}
