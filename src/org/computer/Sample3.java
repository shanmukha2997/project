package org.computer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample3 {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		System.out.println(l);
		Iterator<Integer>iterator=l.iterator();
		while (iterator.hasNext()) {
			Integer next = (Integer) iterator.next();
			System.out.println(next);
			if (next ==300) {
				iterator.remove();
				
			}
			
		}
		System.out.println(l);
	}

}
