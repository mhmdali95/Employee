package com.example.demo.model;
import javax.persistence.*;
@Entity
public class Employee {
	private long id;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (nullable=false,updatable=false)
	private String firstname;
	private String lastname;
	private long age;
	
	
	
	public Employee(long id, String firstname, String lastname, long age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	public Employee() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	

}
