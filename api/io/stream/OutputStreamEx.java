package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {

		/*
		 *1.FileOutputStream은 파일을 쓸 때 사용하는 클래스입니다4 
		 *2. 생성자 매개값으로 파일을 쓸 전체 경로를 지정합니다.
		 *
		 *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명 > ");
		String name = scan.next();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\course\\file\\"+name+".txt");
			System.out.print("문장을 입력하세요 > ");
			scan.nextLine();//next()다음에 nextLine()을 사용하려면, 그냥 넘어가버리는 문제가 생겨 엔터값을 제거
			String str = scan.nextLine();

			byte[] arr = str.getBytes();//입력받은 문자열을 byte[] 로 반환

			fos.write(arr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}



	}
}
