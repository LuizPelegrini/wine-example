package com.luiz.wines.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.NumberFormat;

@Entity
public class Wine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private WineType type;
	
	@NumberFormat(pattern="#,##0.00")
	private BigDecimal price;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WineType getType() {
		return type;
	}
	public void setType(WineType type) {
		this.type = type;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setValue(BigDecimal price) {
		this.price = price;
	}
}
