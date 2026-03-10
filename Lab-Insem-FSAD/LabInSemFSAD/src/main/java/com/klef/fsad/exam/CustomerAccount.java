package com.klef.fsad.exam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CustomerAccount")
public class CustomerAccount {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)  
	 private int id;
	 private String name;
	 private String description;
	 private String date;
	 private String status;
	 private String location;
	 
	 public CustomerAccount(int id, String name, String description, String date, String status, String location) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.status = status;
		this.location = location;
	}
	 public CustomerAccount() {
		// TODO Auto-generated constructor stub
	}
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 public String getDate() {
		 return date;
	 }
	 public void setDate(String date) {
		 this.date = date;
	 }
	 public String getStatus() {
		 return status;
	 }
	 public void setStatus(String status) {
		 this.status = status;
	 }
	 public String getLocation() {
		 return location;
	 }
	 public void setLocation(String location) {
		 this.location = location;
	 }
	 @Override
	 public String toString() {
		return "CustomerAccount [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date
				+ ", status=" + status + ", location=" + location + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDescription()=" + getDescription() + ", getDate()=" + getDate() + ", getStatus()=" + getStatus()
				+ ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	 }
	 
	 
}
