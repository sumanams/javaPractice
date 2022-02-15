package javaPractice;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		ArrayList<Integer> primeList=findPrimes(n);
		System.out.println(primeList);
	}

	public static ArrayList<Integer> findPrimes(int n) {
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		for (int i=0;i<=n;i++) {
			if(isPrime(i)) {
				primeList.add(i);
			}
		}
		return primeList;
	}
	public static boolean isPrime(int n) {
		if(n==0 || n==1 || n==2) {
			return true;
		}
		for (int i=2;i<=n;i++) {
			if(n!=i && n%i==0 ) {
				return false;
			}
		}
		return true;
	}
}
