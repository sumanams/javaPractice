package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class StringSegments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hellonow";
		//Set <String> dictonary = new HashSet<String>();
		//dictonary.addAll();
		//String[] = {"hello", "hell", "on", "now"};
		Set<String> dictonary=new HashSet<String>();
		dictonary.add("hello");
		dictonary.add("hell");
		dictonary.add("on");
		dictonary.add("now");
		for (int i=1;i<s.length()-1;i++) {
			String s1=s.substring(0, i);
			String s2=s.substring(i+1,s.length()-1);
			if (dictonary.contains(s1) && dictonary.contains(s2) ) {
				System.out.println("Found both Strings");
			}
		}
		
	}

}
