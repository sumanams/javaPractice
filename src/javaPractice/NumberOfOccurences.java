package javaPractice;

import java.util.HashMap;

public class NumberOfOccurences {

	public static void main(String[] args) {
		int[] intArr= {1,2,3,1,1,12,2};
		System.out.println("Number of occurances="+getFreq(intArr,1));
	}

	static int getFreq(int[] iAr, int n) {
		HashMap<Integer, Integer> hmap=new HashMap<Integer,Integer>();
		for (int i=0; i<iAr.length; i++) {
			if (iAr[i] == n) {
				if(!hmap.containsKey(iAr[i])) {
					hmap.put(iAr[i], 1);
				} else {
					int c=hmap.get(iAr[i]);
					hmap.put(iAr[i], c+1);
				}
			}
		}
		return hmap.get(n);
	}

}
