package javaPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers
        = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
