package com.dev.encapsulation;

public class PetAnimals {

	public static void main(String[] args) {
		Pets p1[]=new Pets[3];
		
		
		p1[0]=new Pets();
		p1[0].setAge(1);
		p1[0].setColor("black");
		p1[0].setName("Shiro");
		
		p1[1]=new Pets();
		p1[1].setAge(1);
		p1[1].setColor("brown");
		p1[1].setName("Shiny");
	
		
		p1[2]=new Pets();
		p1[2].setAge(2);
		p1[2].setColor("white");
		p1[2].setName("tom");
		
		
		for(int i=0;i<p1.length;i++) {
			System.out.println("Age: "+p1[i].getAge());
			System.out.println("Color: "+p1[i].getColor());
			System.out.println("Name: "+p1[i].getName());
		}
		
	}

}
