package javaPractice;

public class reverseString {

	public static void main(String[] args) {
		String s="sumana";
		String rs="";
		for (int i=s.length()-1;i>=0;i--) {
			rs=rs+s.charAt(i);
		}
		System.out.println("Old string : "+s+"\nReverse String: "+rs);
	}

}
