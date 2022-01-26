package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAr= {1,2,3,4,5};
		int target=5;
		
		int[] result=findIndexes(intAr,target);
		System.out.println("Indices : "+result[0]+" and "+result[1]);
	}
 
	public static int[] findIndexes(int[] intAr, int target) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i < intAr.length;i++) {
			int delta=target-intAr[i];
			if(map.containsKey(delta)) {
				return new int[] {i,map.get(delta)};
			}
			map.put(intAr[i], i);
		}
		return new int[] {-1,-1};
	}
	
	
}
