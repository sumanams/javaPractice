package javaPractice;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sumana", t="usmana";
	//	char[] s1=s.toCharArray(), t1=t.toCharArray();
//		Arrays.sort(s1);
//		Arrays.sort(t1);
//		
//		if (Arrays.equals(s1, t1) ) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
		HashMap<Character,Integer> smap=new HashMap<>();
		HashMap<Character,Integer> tmap=new HashMap<>();
		for(char c:s.toCharArray()) {
			smap.put(c, smap.getOrDefault(c, 0)+1);
			
		}
		for(char c:t.toCharArray()) {
			tmap.put(c, tmap.getOrDefault(c, 0)+1);
			
		}
		
		if (smap.equals(tmap)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
