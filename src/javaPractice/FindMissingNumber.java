package javaPractice;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iAr= {1,4,2,5,3,6,7};
		int n=8;
		
		System.out.println("The missing number is :"+findMissingNum(iAr,n));
		
		
	}

	static int findMissingNum(int[] iAr, int n) {
		Arrays.sort(iAr);
		
		int mNum=0;
		for(int i=0; i<n-2; i++) {
			if(iAr[i+1]!=iAr[i]+1) {
				mNum= iAr[i]+1;
				
			}
		}
		//System.out.println(iAr);
		return mNum;
		
	}
	
}
