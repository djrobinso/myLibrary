/**
 * 
 */
package library;

import org.springframework.data.repository.CrudRepository;

import library.Book;


/**
 * @author Deyonta
 *
 */
public interface LibraryRepository extends CrudRepository<Book, Integer>{

}
