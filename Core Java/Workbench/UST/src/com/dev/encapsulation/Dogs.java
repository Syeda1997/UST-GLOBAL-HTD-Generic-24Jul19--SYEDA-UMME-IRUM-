package com.dev.encapsulation;

public class Dogs implements Comparable<Dogs> {
	private int Age;
	private String name;
	private String breed;
	private String color;
	
	
	@Override
	public String toString() {
		return "Dogs [Age=" + Age + ", name=" + name + ", breed=" + breed + ", color=" + color + "]";
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int compareTo(Dogs d) {
		return (this.Age - d.Age);
	}
	
}
