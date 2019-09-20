package com.dev.collections;

import java.util.HashMap;

public class ImpInt implements StuInt{
	
	HashMap<String,Students> hm=new HashMap<String,Students>();

	@Override
	public Students addStu(String k, Students s) {
		if(s!=null) {
			hm.put(k,s);
			if(s!=null) {
				Students r=hm.put(k,s);
			}
			return s;
		}
		return null;
	}

	@Override
	public void getStu() {
		System.out.println(hm);
		
	}

	@Override
	public Students remStu(String k, Students s) {
		Students z=hm.remove("2");
		System.out.println(z);
		System.out.println(hm);
		return z;
		
	}

	@Override
	public void upStu(String k, Students s) {
		s.setBranch("ec");
		System.out.println(hm);
	}

	
}
