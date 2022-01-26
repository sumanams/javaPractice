package javaPractice;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","flight"};


		int count=0;
		String s=strs[0];
		System.out.println("First string="+s);
		int len=s.length();
		int aLen=strs.length;
		for(int i=1; i<=len;i++) {
			System.out.println("i="+i);
		    String subStr=s.substring(0, i);
			count=i;
			System.out.println("--- s="+s.substring(0, i));
			for (int j=1; j< aLen;j++) {
				System.out.println("j="+j+"  str : "+strs[j]);
				if (strs[j].length() < i) {
					break;
				}
 				if( subStr.compareTo(strs[j].substring(0,i)) !=0 ) {
 					System.out.println("Mismatch --> ="+strs[j].substring(0,i));
					count=i-1;
					break;
				}
				
			}
			if ( count!=i) {
				break;
			}
			
		}
		System.out.println("count="+count);

	}
}