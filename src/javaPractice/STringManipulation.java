package javaPractice;

public class STringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc12def231ghi39248sd";
		String reg="[0-9]+";
		String[] s1=s.split(reg);
		String ireg="[a-z]+";
		String[] intStr=s.split(ireg);
		String newStr="";
		
		for (int i=0;i<s1.length;i++) {
			StringBuilder sb=new StringBuilder(s1[i]);
			sb.reverse();
			System.out.println(sb+"  "+intStr[0]);
			if(intStr[i]!=null) {
				System.out.println("i ="+i+"    intStr[i]="+intStr[i]);
				newStr=newStr+sb+intStr[i];
			}
		}
		System.out.println(newStr);
	}

}
