package javaPractice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		String s1="", s2="";
		for( char c: s.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				
				s1=s1+c;
				s2=c+s2;
			}
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		System.out.println(s1+"        "+s2);
		if(s1.compareTo(s2) == 0) {
			System.out.println("Palindrome");
		}
		
		String str="sumana";
		//System.out.println(str);
		String str1=String.join("*", str.split(""));
		System.out.println(str1);
		
	}

}
