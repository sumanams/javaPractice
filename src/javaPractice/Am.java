package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class Am {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> intAr=new  ArrayList<List<Integer>>();
			//{{1,0,0},{1,0,0},{1,9,0}};
		System.out.println(intAr.length);



		for (int i=0;i<intAr.length;i++) {
			for (int j=0;j<intAr[i].length;j++) {
				System.out.println(intAr[i][j]);
				
			}
		}


	}

}
