package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Altimetrik {

	public static void main(String[] args) {
		int a[] = {1,2,2,3,4,4,5,5,6,7};
		ArrayList<Integer> dupArr=new ArrayList<Integer>();
		ArrayList<Integer> nonDupArr=new ArrayList<Integer>();
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count;
		for(int i=0;i<a.length;i++) {
			
			if(map.get(a[i])!=null) {
				count=map.get(a[i])+1;
				
			} else {
				count=1;
			}
			
			
			map.put(a[i], count);
			System.out.println(map);
		}
		
		for(int i:map.keySet()) {
			if(map.get(i)==1) {
				nonDupArr.add(i);
			}
			else {
				dupArr.add(i);
			}
		}
		System.out.println(dupArr);
		System.out.println(nonDupArr);
	}
	
	

}
