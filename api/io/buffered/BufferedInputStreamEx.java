package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class BufferedInputStreamEx {
	public static void main(String[] args) {

		/*
		 *Buffered가 붙은 InputStream은 바이트기반, 입력 속도를 향상시켜주기 위한 클래스입니다.
		 * 
		 */
		
		BufferedInputStream bf = null;
		try {
			bf = new BufferedInputStream(new FileInputStream("D:\\course\\file\\test2.txt"));
			
			//FileInputStream에서 사용했던 방식과 동일
			while(true) {
				int a= bf.read();//한글자 읽어서 반환
				if( a== -1)break;
				System.out.print( (char)a );
			}
			
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
