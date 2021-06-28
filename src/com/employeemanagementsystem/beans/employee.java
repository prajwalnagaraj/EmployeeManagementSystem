package com.employeemanagementsystem.beans;

//@entity
public class employee {
	// @Id
	private int Id;
	private String Name;
	private String Contact;
	private String Email;
	private String Dept;
	private int Salary;

	@Override
	public String toString() {
		return "employee [Id=" + Id + ", Name=" + Name + ", Contact=" + Contact + ", Email=" + Email + ", Dept=" + Dept
				+ ", Salary=" + Salary + "]";
	}

	public employee(int id, String name, String contact, String email, String dept, int salary) {
		super();
		Id = id;
		Name = name;
		Contact = contact;
		Email = email;
		Dept = dept;
		Salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

}
