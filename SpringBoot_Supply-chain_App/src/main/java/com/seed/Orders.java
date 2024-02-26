package com.seed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prodId;
	private String  prodName;
	private String prodQntity;
	private String  deleveryAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdQntity() {
		return prodQntity;
	}
	public void setProdQntity(String prodQntity) {
		this.prodQntity = prodQntity;
	}
	public String getDeleveryAddress() {
		return deleveryAddress;
	}
	public void setDeleveryAddress(String deleveryAddress) {
		this.deleveryAddress = deleveryAddress;
	}
	
	

}
