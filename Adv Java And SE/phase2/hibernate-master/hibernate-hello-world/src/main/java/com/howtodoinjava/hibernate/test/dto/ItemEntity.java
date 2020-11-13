package com.howtodoinjava.hibernate.test.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class ItemEntity implements Serializable {
	

	private static final long serialVersionUID = -101123132891958612L;

	@Id
	@Column(name="ID", unique = true, nullable = false)
	private Integer itemno;
	
	@Column(name="price", unique = false, nullable = false)
	private Integer price;

	public Integer getItemno() {
		return itemno;
	}

	public void setItemno(Integer itemno) {
		this.itemno = itemno;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
