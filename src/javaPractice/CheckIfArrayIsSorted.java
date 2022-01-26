package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class CheckIfArrayIsSorted {
	public static void main(String[] args) {
		int[] iAr= {1,4,2,5,2,6};
		int size=iAr.length;
		
		//System.out.println(isSorted(iAr,size));
		
		
		List<String> sList= new ArrayList<String>();
		sList.add("z");
		sList.add("b");
		sList.add("b");
		sList.add("d");
		
		System.out.println(sList);
		int ssize=sList.size();
		System.out.println(isStrSorted(sList,ssize));
		
		
	}
	static String isSorted(int[] iAr, int n) {
		//if size of the array is 0/1, return true
		if(n==0 || n==1) {
			return "Yes";
		}
		
		if (iAr[n-1] < iAr[n-2]) {
			return "No";
		}
		return isSorted(iAr,n-1);
	}
	
	static String isStrSorted(List<String> sList, int n) {
		//if size of the array is 0/1, return true
		if(n==0 || n==1) {
			return "Yes";
		}
		
		String a=sList.get(n-1);
		String b=sList.get(n-2);
		
		if (a.compareTo(b) < 0) {
			return "No";
		}
		return isStrSorted(sList,n-1);
	}
	
}
