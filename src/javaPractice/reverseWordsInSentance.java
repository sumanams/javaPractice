package javaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class reverseWordsInSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="                  I                                love you                         ";
		String newStr="";
		
		s=s.trim();
		String[] words=s.split("\\s+");
		
		for(int i=words.length-1;i>=0;i--) {
			newStr=newStr+words[i]+" ";
		}
		newStr=newStr.trim();
		//newStr=String.join(" ", words);
		System.out.println(newStr);
	}

}
