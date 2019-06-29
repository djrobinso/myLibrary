/**
 * 
 */
package library;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author Deyonta
 *
 */

@Entity
@Table(name = "bookData")
public class Book {
	
	@Id
	private int entry_id;
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "aurthorFirst", nullable = false)
	private String aurthorFirst;
	
	@Column(name = "aurthorLast",  nullable = false)
	private String aurthorLast;
	
	@Column(name = "barcode", nullable = false)
	private String barcode;
	
	//@OneToMany(mappedBy = "ID_number", cascade = CascadeType.ALL)
	private String borrowerID; //foreign key (Patron ID number)
	
	private int CheckIn_Out ;
	
	public Book() {
		
	}
	
	public Book(String title, String aurthorFirst,String aurthorLast, String barcode, String borrowerID, int CheckIn_Out) {
		this.title = title;
		this.aurthorFirst = aurthorFirst;
		this.aurthorLast = aurthorLast;
		this.barcode = barcode;
		this.borrowerID = borrowerID;
		this.CheckIn_Out = CheckIn_Out;
		
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAurthorFirst() {
		return aurthorFirst;
	}
	public void setAurthorFirst(String aurthorFirst) {
		this.aurthorFirst = aurthorFirst;
	}
	public String getAurthorLast() {
		return aurthorLast;
	}
	public void setAurthorLast(String aurthorLast) {
		this.aurthorLast = aurthorLast;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBorrowerID() {
		return borrowerID;
	}
	public void setBorrowerID(String borrowerID) {
		this.borrowerID = borrowerID;
	}
	public int getCheckIn_Out() {
		return CheckIn_Out;
	}
	public void setCheckIn_Out(int checkIn_Out) {
		this.CheckIn_Out = checkIn_Out;
	}

	public int getEntry_id() {
		return entry_id;
	}

	public void setEntry_id(int entry_id) {
		this.entry_id = entry_id;
	}

}
