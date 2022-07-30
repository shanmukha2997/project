package org.computer;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
import java.util.ListIterator;

	public class Sample4 {
		public static void main(String[] args) {
			List<Integer>l=new ArrayList<>();
			l.add(100);
			l.add(200);
			l.add(300);
			l.add(400);
			l.add(500);
			System.out.println(l);
			ListIterator<Integer>listIterator=l.listIterator();
			System.out.println("Traverse in forword Direction");
			while (listIterator.hasNext()) {
				Integer next =  listIterator.next();
				System.out.println(next);
			}
			System.out.println("Traverse in reverse Direction");
			while (listIterator.hasPrevious()) {
				Integer next =  listIterator.previous();
				System.out.println(next);
				if (next ==300) {
					listIterator.remove();
				
					
				}
				
			}
			System.out.println(l);
		}

	}



