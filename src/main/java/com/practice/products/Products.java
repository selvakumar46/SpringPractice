package com.practice.products;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long product_id;

private String product_name;
private double product_price;

private int stock;
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Long getProduct_id() {
	return product_id;
}
public void setProduct_id(Long product_id) {
	this.product_id = product_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public double getProduct_price() {
	return product_price;
}
public void setProduct_price(double product_price) {
	this.product_price = product_price;
}

}
