package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmazonInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rideDuration=90;
		int[] songDurations= {1,10,25,35,60};
		
		List<Integer> intList=findSongs(rideDuration,songDurations);
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		
	}

	public static List<Integer> findSongs(int rideDuration, List<Integer> songDurations) {
	    // Write your code here
		
		//Creating a list in case songs are not found = {-1,-1}
		List <Integer> intList=new ArrayList<Integer>();
		intList.add(0, -1);
		intList.add(1,-1);
		
		//Create a hashmap to store songDurations and their index
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int lenOfList=songDurations.size();
		int delta=0;
		
		for (int i=0;i<lenOfList;i++) {
			//Calculate the delta = difference between total ride duration and song duration
			delta=rideDuration-songDurations.get(i)-30;
			
			if(map.containsKey(delta)) {
				//return i and value of delta 
				intList.add(0,i);
				intList.add(1,map.get(delta));
				return intList;
			}
			map.put(songDurations.get(i),i);
		}
		return intList;
	}
}
