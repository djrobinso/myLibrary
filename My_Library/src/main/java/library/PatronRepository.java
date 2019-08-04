/**
 * 
 */
package library;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import library.Patron;


/**
 * @author Deyonta
 *
 */
public interface PatronRepository extends CrudRepository<Patron, Integer>{
	
	/** **/
	@Query(value = "SELECT * FROM patronData WHERE ID_number = pulledPatronID", nativeQuery=true)
	List <Patron> pullPatronData(@Param("pulledPatronID") String pulledPatronID);
	
	/**
	@Query(value="SELECT * From patronData WHERE ID_number = ID_Number", nativeQuery = true)
	List <Patron> findByID_number(String ID_number);
	**/
	
	
}
