package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class CountChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbcccdddd";
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int count;
		for(char c:s.toCharArray()) {
			if(map.containsKey(c)) {
				count=map.get(c);
				map.put(c, count+1);
			}
			else {
				map.put(c, 1);
			}
		}
		String newStr="";
		for(char c:map.keySet()) {
			count=map.get(c);
			newStr=newStr+c+count;
		}
		
		System.out.println(newStr);
	}

}
