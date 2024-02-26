package com.seed;

import jakarta.persistence.Column;
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
public class Product {
    @Id    @Column(length=7)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prodId;
    @Column(length=15)
	private String prodName;
    @Column(length=7)
	private Float prodPrice;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Float getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Float prodPrice) {
		this.prodPrice = prodPrice;
	}
    
    
}
