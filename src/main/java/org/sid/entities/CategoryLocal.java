package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoryLocal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String category;
	
	public CategoryLocal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryLocal(String category) {
		this.category = category;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
