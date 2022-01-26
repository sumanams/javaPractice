package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// Create an ArrayList
		List<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("aaa");
		System.out.println(al);
		
		List<String> bl=new ArrayList<String>();
		bl.add("1");
		bl.add("3");
		bl.add("2");
		System.out.println(bl);
		
		//Print elements in ArrayList
		for(String el:al) {
			System.out.println(el);
		}
		
		//Insert an element into the ArrayList at a given index
		al.add(1, "a1");
		System.out.println(al);
		
		//Retrieve an element at given index
		System.out.println(al.get(1));
		
		//Replace an element
		al.set(1, "b1");
		System.out.println(al);
		
		//Remove an element
		al.remove(1);
		System.out.println(al);
		
		//Search an element
		System.out.println(al.contains("a2"));
		
		//sort
		Collections.sort(al);
		System.out.println(al);
		
		//Copy one arraylist to another
		Collections.copy(al, bl);
		System.out.println(al);
		
		//Reverse
		Collections.reverse(al);
		System.out.println(al);
		
		//Sublist
		System.out.println(al.subList(0, 2));
		
		//swap
		Collections.swap(al, 0, 2);
		System.out.println(al);
		
		//Add 2 arraylists
		ArrayList<String> cl=new ArrayList<String>();
		cl.addAll(al);
		cl.addAll(bl);
		System.out.println("New arraylist cl :"+cl);
		
		//Remove all the elements
		cl.clear();
		System.out.println("After clearing cl :"+cl);
		
		//Check if arraylist is empty
		System.out.println(cl.isEmpty());
		
		//element at index
		System.out.println(al.get(1));
		
		//Iterate through the list
		Iterator<String> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Convert arraylist to list
		al.toArray();
		System.out.println("After converting al to array: "+al);
	}

}
