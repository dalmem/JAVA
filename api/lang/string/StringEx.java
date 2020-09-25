package api.lang.string;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		
//		String str1 = new String("~~~~");
		
//		char[] arr = {'h','e','l','l','o'};
//		String str = new String(arr);
//		System.out.println(str);
	
		//charAt() - 문자열 인덱스번호 자르기
		String str = "안녕하세요";
		
		System.out.println(str.charAt(0));
		//indexof() - 문자열을 찾아서 인덱스 반환
		int a2 = str.indexOf("안");
		System.out.println(a2);
		
		//lastindexof() - 문자열을 뒤에서 찾아서 인덱스 반환
		int a3 = str.lastIndexOf("안");
		System.out.println(a3);
		
		//length() - 길이
		System.out.println("문자열 길이 : " + str.length());
		
		//replace() - 특정문자열 변경
		String str2 = "자바의 유래를 아시나요? 자바는 커피집 이름입니다";
//		String a4 = str2.replace("자바", "java");
//		System.out.println(a4);
//		str2 = str2.replace("자바", "JAVA");
//		System.out.println(str2);
		
		//공백제거
//		str2= str2.replace(" ","");
//		System.out.println(str2);
		str2 = str2.replace("자바", "java").replace(" ", "");
		System.out.println(str2);
		
		//substring() - 문자열 자르기
		String str3 = "123123-4564564";
		String a5 = str3.substring(7);
		System.out.println(a5);
		String a6 = str3.substring(7, str3.length());
		System.out.println("z" +a6);
		
		//toUpperCase() - 대문자로 변경, toLowerCase() - 소문자로 변경
		String str4 = "hello jack";
		str4 = str4.toUpperCase();		
		System.out.println(str4);
		
		//trim() - 앞뒤 공백제거
		String str5 = "       홍 길동 ";
		str5 = str5.trim();
		System.out.println(str5);
		
		//valueOf() - 기본형타입을 문자열로 변경
		System.out.println(1+1);
		System.out.println(String.valueOf(1)+1);
		
		//split() - 문자열 자르기
		String str6 = "010-1234-5678";
		String[] arr1 = str6.split("-");
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = str6.split("-",2);//배열의 최대값을 2개로
		System.out.println(Arrays.toString(arr2));
		
	}
}
