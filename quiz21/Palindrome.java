package quiz21;

import java.util.Arrays;

public class Palindrome {

	public static String palidromeCheck(String str) {
		
		String result = "";
		str = str.replace(" ", "");
		String str1, str2, rev="";
		
//		if(str.length()%2 ==1) {
//			str1 = str.substring(0,str.length()/2);
//			str2 = str.substring(str.length()/2+1,str.length());
//		}else {
//			str1 = str.substring(0,str.length()/2);
//			str2 = str.substring(str.length()/2,str.length());
//		}
		
		for (int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		if(str.equals(rev))
			result = "회문입니다";
		
		else
			result = "회문이 아닙니다";
		
		
		return result;
		
		
//		String[] arr1 = str1.split("");
//		String[] arr2 = str2.split("");
//
//		if(arr1.length == arr2.length) {
//			if(arr1.length ==1) {
//				if(arr1[0].equals(arr2[0])) {
//					result = "회문입니다";
//				}else
//					result = "회문이 아닙니다";
//			}else {
//				for (int i = 0; i < arr1.length-1; i++) {
//					if(arr1[i].equals(arr2[(arr2.length-1)-i]) ) {
//						result ="회문입니다";
//					}else
//						result ="회문이 아닙니다";
//
//				}
//			}
//		}



	}
}
