/**
 * 
 */
package library;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author Deyonta
 *
 */

@Entity
@Table(name = "bookData")
public class Book implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "bookEntryID")
	private int entry_id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "aurthorFirst", nullable = false)
	private String aurthorFirst;
	
	@Column(name = "aurthorLast",  nullable = false)
	private String aurthorLast;
	
	@Column(name = "barcode", nullable = false)
	private String barcode;
	
	/**
	 * many books have a single patron that checks them out
	 * */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_number")
	private Patron patron; //foreign key (Patron ID number)
	
	private int CheckIn_Out ;
	
	public Book() {
		
	}
	
	public Book(String title, String aurthorFirst,String aurthorLast, String barcode, Patron patron, int CheckIn_Out) {
		this.title = title;
		this.aurthorFirst = aurthorFirst;
		this.aurthorLast = aurthorLast;
		this.barcode = barcode;
		this.patron = patron;
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
	public Patron getPatron() {
		return patron;
	}
	public void setPatron(Patron patron) {
		this.patron = patron;
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
