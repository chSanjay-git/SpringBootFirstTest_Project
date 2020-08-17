package com.sanjay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "PRODUCT_TAB")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

	@Id
	@Column(name = "id_prod_col")
	@GeneratedValue
	private Integer Id;

	@Column(name = "name_prod_col")
	private String Name;

	@Column(name = "qan_prod_col")
	private String quantity;

	@Column(name = "price_prod_col")
	private double price;
}
