package com.curso.ecommercee.model;

public class Product {
	private Integer id;
	private String nombre;
	private String description;
	private String picture;
	private Double cost;
	private Integer amount;
	
	public Product() {
		
	}
	
	
	public Product(Integer id, String nombre, String description, String picture, Double cost, Integer amount) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.description = description;
		this.picture = picture;
		this.cost = cost;
		this.amount = amount;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	public Integer getAmount() {
		return amount;
	}


	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", nombre=" + nombre + ", description=" + description + ", picture=" + picture
				+ ", cost=" + cost + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
	
	
}
