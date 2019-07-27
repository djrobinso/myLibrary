/**
 * 
 */
package library;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import library.Patron;


/**
 * @author Deyonta
 *
 */
public interface PatronRepository extends CrudRepository<Patron, Integer>{
	
	/**
	 * 
	 * **/
	@Query(value = "SELECT * FROM patronData WHERE ID_number = pulledPatronID", nativeQuery=true)
	public Patron pullPatronData(@Param("pulledPatronID") String pulledPatronID);
	
	
	
}
