package javaPractice;

public class ReverseSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sumana                            is a winner";
		String rStr="";
		String[] sArr=s.split(" +");
		
		for(int i=sArr.length-1;i >=0;i-- ) {
			rStr=rStr+" "+sArr[i].trim();
		}
		System.out.println(rStr.trim());
	}

}
