package com.p1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Person 
{
  @Id
  @Column
  int p_id;
  @Column 
  String pname;
  @Column
  String pcity;
  @Column
  double psalary;
  
  public Person() {
	
  	}

  public Person(int p_id, String pname, String pcity, double psalary) {
	this.p_id = p_id;
	this.pname = pname;
	this.pcity = pcity;
	this.psalary = psalary;
   }

public int getP_id() {
	return p_id;
}

public void setP_id(int p_id) {
	this.p_id = p_id;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getPcity() {
	return pcity;
}

public void setPcity(String pcity) {
	this.pcity = pcity;
}

public double getPsalary() {
	return psalary;
}

public void setPsalary(double psalary) {
	this.psalary = psalary;
}
	
}
