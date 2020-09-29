package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamEx {
	public static void main(String[] args) {
		/*
		 * buffered가 붙은 클래스는 입출력 성능을 향상시키기 위한 클래스입니다.
		 * buffered에 outputStream이 있으면, 바이트 기반, 쓰기위한 클래스입니다.
		 * 
		 * 생성자 매개변수로 바이트기반 클래스를 받을 수 있습니다
		 * buffered가 붙어 있는 클래스는 flush 명령을 통해서 데이터를 밀어주는 작업을 해야합니다.
		 * 
		 */
//		FileOutputStream fos = new FileOutputStream("경로");
//		
//		BufferedOutputStream bf = new BufferedOutputStream(fos);
		BufferedOutputStream bf =null;
		Scanner scan = new Scanner(System.in);
		try {
			bf = new BufferedOutputStream(new FileOutputStream("D:\\course\\file\\test2.txt"));
			
			System.out.print("문장을 입력하세요 >");
			String str = scan.nextLine();
			
			bf.write( str.getBytes() );//getBytes로 바이트배열로 변경해서, 파일을 써내림
			//bf.flush();//모은 데이터를 밀어주는 명령
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			try {
				
				//close닫을 때는 바깥 클래스부터 close처리합니다
				
				bf.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
