package org.computer;

import java.util.Enumeration;
import java.util.Vector;

public class Sample1 {
	public static void main(String[] args) {
		
		Vector<Integer>v=new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		Enumeration<Integer>e=v.elements();
		while (e.hasMoreElements()) {
			Integer nextElement =  e.nextElement();
			System.out.println(nextElement);
			
		}
		
	}

}
