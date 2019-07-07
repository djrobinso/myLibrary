/**
 * 
 */
package library;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Patron implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patronEntryID")
	private int entry_id;
	
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "ID_number", nullable = false)
	private String ID_number;
	
	@Column(name = "occupation", nullable = false)
	private String occupation;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "patron", cascade = CascadeType.ALL)
	private Set<Book> booksCheckedOut;
	
	
	public Patron() {
		
	}
	
	public Patron(String firstName, String lastName, String address, String ID_number, String occupation, Set<Book> booksCheckedOut){
		this.firstName  = firstName;
		this.lastName = lastName;
		this.address = address;
		this.ID_number = ID_number;
		this.occupation = occupation;
		this.booksCheckedOut = booksCheckedOut;
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
	
	public String getID_number() {
		return ID_number;
	}
	
	public String getOccupation() {
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
	
	public void setID_number(String ID_number) {
		this.ID_number = ID_number;
	}

	public int getEntry_id() {
		return entry_id;
	}

	public void setEntry_id(int entry_id) {
		this.entry_id = entry_id;
	}
	
	public Set getBooksCheckedOut() {
		return booksCheckedOut;
	}
	
	public void setBooksCheckedOut(Set<Book> booksCheckedOut) {
		this.booksCheckedOut = booksCheckedOut;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
}
