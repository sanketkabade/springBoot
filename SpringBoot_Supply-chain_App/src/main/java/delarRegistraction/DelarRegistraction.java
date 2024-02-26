package delarRegistraction;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString

public class DelarRegistraction {
	@Id
    private int id;
	private String personName;
	private String organizationName;
	private int contact;
	private String email;
	private String wearAddress;
	private String compnyAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWearAddress() {
		return wearAddress;
	}
	public void setWearAddress(String wearAddress) {
		this.wearAddress = wearAddress;
	}
	public String getCompnyAddress() {
		return compnyAddress;
	}
	public void setCompnyAddress(String compnyAddress) {
		this.compnyAddress = compnyAddress;
	}
	
	
}
