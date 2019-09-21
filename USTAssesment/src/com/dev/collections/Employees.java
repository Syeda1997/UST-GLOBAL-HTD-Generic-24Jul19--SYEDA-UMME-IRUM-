package com.dev.collections;

public class Employees {
	private int employee_id;
	private String Employee_name;
	private String Employee_type;
	private String Email;
	private String Password;
	private String Leave;
	private String Leave_Status;
	
	@Override
	public String toString() {
		return "Empdetails [employee_id=" + employee_id + ", Employee_name=" + Employee_name + ", Employee_type="
				+ Employee_type + ", Email=" + Email + ", Password=" + Password + ", Leave=" + Leave + ", Leave_Status="
				+ Leave_Status + "]";
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return Employee_name;
	}
	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}
	public String getEmployee_type() {
		return Employee_type;
	}
	public void setEmployee_type(String employee_type) {
		Employee_type = employee_type;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getLeave() {
		return Leave;
	}
	public void setLeave(String leave) {
		Leave = leave;
	}
	public String getLeave_Status() {
		return Leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		Leave_Status = leave_Status;
	}
	
}
