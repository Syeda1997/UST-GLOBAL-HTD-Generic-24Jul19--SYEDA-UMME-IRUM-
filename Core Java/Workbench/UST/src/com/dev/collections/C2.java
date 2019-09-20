package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Dogs;

public class C2 {
	public static void main(String[] args) {
		HashMap<String, Dogs> hm=new HashMap<String,Dogs>();
		
		Dogs d=new Dogs();
		d.setAge(1);
		d.setBreed("D M");
		d.setName("Shiro");
		d.setColor("Black");

		Dogs d1=new Dogs();
		d1.setAge(2);
		d1.setBreed("Dalmation");
		d1.setName("Ronnie");
		d1.setColor("Black&White");
		
		Dogs d2=new Dogs();
		d2.setAge(2);
		d2.setBreed("Dalmation");
		d2.setName("Nikkie");
		d2.setColor("Black&White");
		
		hm.put("1", d);
		hm.put("2", d1);
		hm.put("3", d2);
		
		/*
		 * Dogs r=hm.remove("2"); System.out.println(r); System.out.println(hm);
		 * 
		 * System.out.println(hm.containsKey("3"));
		 * 
		 * System.out.println(hm.containsValue(d));
		 * 
		 * System.out.println(hm.size());
		 */
		
	}

}
