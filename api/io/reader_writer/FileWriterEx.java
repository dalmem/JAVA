package api.io.reader_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterEx {
	
	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할때 사용하는 클래스는 FileWriter클래스입니다
		 * 기본적으로 2바이트 단위로 처리하기 때문에 문자를 쓰기에 적합합니다. 
		 */
		
		Writer fw = null;
		try {
			fw = new FileWriter("D:\\course\\file\\test.txt");
			// \n줄바꿈 명령 전에 \r을 사용해서 커서를 처음으로 옮겨줍니다.
			
			String str = "오늘은 9월 25일 입니다~\r\n아 금요일이다.\r\n집에가야지";
			
			fw.write(str);//write() 가 매개변수로 문자열을 받아줍니다.
			System.out.println("파일이 정상적으로 저장 되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
