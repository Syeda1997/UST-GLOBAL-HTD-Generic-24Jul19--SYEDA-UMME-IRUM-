package com.dev.collections;

public class Students {
	private String name;
	private int usn;
	private String branch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", usn=" + usn + ", branch=" + branch + "]";
	}

}
