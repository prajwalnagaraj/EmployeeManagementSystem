package com.employeemanagementsystem.dao;

public class Equeries {
	
	String sql1 = "insert into employee(name,dept) values(?,?)";
	String sql2 = "delete from employee where id=?";
	String sql3 = "select * from employee where dept=?";
	String sql4 = "select * from employee where name='mukesh'";
	String sql5 = "select * from employee where dept='hr'";
	String sql6 = "select * from employee where id<3";


}
