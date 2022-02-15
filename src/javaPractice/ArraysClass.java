package javaPractice;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		String[] s= {"a","b","c"};

		String strArr=Arrays.toString(s);
		System.out.println(strArr);

		System.out.println("Integer Array as List: "
				+ Arrays.asList(s));


		int intArr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(intArr);

		int intKey = 22;

		// Print the key and corresponding index
		System.out.println(
				intKey + " found at index = "
						+ Arrays.binarySearch(intArr, intKey));



		int arr[][] = new int[3][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];

		int sum =0;

		for(int i= 0;i<3;i++) {
			for( int j =0;i<3;j++) {
				arr[i][j]=j+1;
			}
		}
		for(int i=0;i<3;++i) {
			for( int j =0;i<3;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
		
		
	}
}





