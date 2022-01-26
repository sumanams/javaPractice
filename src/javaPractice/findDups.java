package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class findDups {
	public static void main(String[] args) {
		int A[]= {1,4};
		int n=A.length;
		
		System.out.println(singleNumber(A,n));
		
	}
	static int singleNumber(int A[], int n) {
	    int result = 0;
	    for (int i = 0; i<n; i++)
	    {
			result ^=A[i];
			System.out.println(" result ="+result+"  i="+i);
	    }
		return result;
	}
}
