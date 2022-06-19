package com.Gaurav.kaushik;

public class Employee {
private String FirstName;
private String LastName;

public Employee(String firstName, String lastName) {
	FirstName = firstName;
	LastName = lastName;
}

public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}

public void Technical() {
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}


public void Admin() {
	
	
}

public void HumanResource() {
	
	
}

public void Legal() {
	  
}

}
