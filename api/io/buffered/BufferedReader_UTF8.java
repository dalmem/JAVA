package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReader_UTF8 {
	public static void main(String[] args) {

		/*
		 * InputStreamReader는 InputStream타입의 클래스를 Reader클래스 형태로 읽어주는 매개자 입니다
		 * 1. 키보드를 통해 값을 받을 수도 있고
		 * 2. 인코딩 형식을 지정해서 파일을 읽을 수 도 있습니다.
		 * 
		 */
		try {
			//1
			//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			//2
			//			InputStream i = new FileInputStream("경로");
			//			Reader is = new InputStreamReader(i,"UTF-8");//(inputStream, 디코딩)
			//			BufferedReader bf = new BufferedReader(is);
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\file\\test3.txt"),"EUC-KR"));
			String str = null;
			
			while((str = bf.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// 
		}
	}
}
