package javaPractice;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		System.out.println("Reverse of "+n+" is:"+reverseInt(n));
	}

	public static int reverseInt(int n) {
		int reverse=0;
		while(n!=0) {
			reverse=reverse*10+n%10;
			n=n/10;
		}
		return reverse;
	}
}
