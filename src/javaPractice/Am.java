package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class Am {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> intAr=new  ArrayList<List<Integer>>();
			//{{1,0,0},{1,0,0},{1,9,0}};
		//System.out.println(intAr.length);

		//******** Master ***********
		int count=0;
		for (int i=0;i<intAr.size();i++) {
			for (int j=0;j<intAr.get(i).size();j++) {
				if(intAr.get(i).get(j)==1) {
					count++;
				}
				if(intAr.get(i).get(j)==9) {
					break;
				}
				
			}
		}


	}

}
