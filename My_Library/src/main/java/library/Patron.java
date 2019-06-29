/**
 * 
 */
package library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author Deyonta
 *
 */
@Entity
@Table(name = "patronData")
public class Patron {
	
	@Id
	private int entry_id;
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	//@OneToMany
	//@JoinColumn
	@Column(name = "ID_number", nullable = false)
	private String ID_number;
	
	@Column(name = "occupation", nullable = false)
	private String occupation;
	
	public Patron() {
		
	}
	
	public Patron(String firstName, String lastName, String address, String ID_number, String occupation){
		this.firstName  = firstName;
		this.lastName = lastName;
		this.address = address;
		this.ID_number = ID_number;
		this.occupation = occupation;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		 return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getID() {
		return ID_number;
	}
	
	public String getOccuaption() {
		return occupation;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setID(String ID_number) {
		this.ID_number = ID_number;
	}

	public int getEntry_id() {
		return entry_id;
	}

	public void setEntry_id(int entry_id) {
		this.entry_id = entry_id;
	}
	
	
	
}
