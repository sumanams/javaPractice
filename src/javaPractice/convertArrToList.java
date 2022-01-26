package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class convertArrToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intAr= {1,2,3,1,2,7,8,4};
		List<Integer> intList=Arrays.asList(intAr);
		Set<Integer> intSet=new TreeSet<Integer>(intList);
		System.out.println(intSet);
		
	}

}
