package quiz07;



public class ArrayPrint {
	
	
	
	//메서드 오버로딩, 문자열 배열을 받아서, 배열요소를 문자열의 형태로 리턴
	
	String printArray(String[] s){
		String a ="[";
		for (int i = 0; i < s.length; i++) {
			if(i != s.length-1)
				a+=s[i]+", ";
			else
				a+=s[i];
		}
		return a+"]";
	}
	String printArray(int[] arr) {
		String a ="[";
		for (int i = 0; i < arr.length; i++) {
			if(i != arr.length-1)
				a+=arr[i]+", ";
			else
				a+=arr[i];
		}
		return a+"]";
		
	}
}
