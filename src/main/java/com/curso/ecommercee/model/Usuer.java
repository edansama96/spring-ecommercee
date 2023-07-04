package com.curso.ecommercee.model;

public class Usuer {
	private Integer id;
	private String nombre;
	private String username;
	private String email;
	private String address;
	private String phonenumber;
	private String type;
	private String password;
	
	public Usuer() {
		
	}
	
	
	
	public Usuer(Integer id, String nombre, String username, String email, String address, String phonenumber,
			String type, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phonenumber = phonenumber;
		this.type = type;
		this.password = password;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Usuer [id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email + ", address="
				+ address + ", phonenumber=" + phonenumber + ", type=" + type + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
