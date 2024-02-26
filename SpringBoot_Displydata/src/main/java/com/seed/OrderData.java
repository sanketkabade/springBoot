package com.seed;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cust_number;
	private int orderId;
	private String location;
	private String orederStatus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCust_number() {
		return cust_number;
	}
	public void setCust_number(int cust_number) {
		this.cust_number = cust_number;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getOrederStatus() {
		return orederStatus;
	}
	public void setOrederStatus(String orederStatus) {
		this.orederStatus = orederStatus;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", cust_number=" + cust_number + ", orderId=" + orderId + ", location=" + location
				+ ", orederStatus=" + orederStatus + "]";
	}
	
	
	
}
