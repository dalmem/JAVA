package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedWriter는 문자기반을 읽을 때 사용하고, 성능향상 스트림 입니다.
		 * 순서대로 readLine으로 두문장을 받아서 파일을 쓰세요.
		 */
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw=null;
		
		try {
			bw = new BufferedWriter(new FileWriter("D:\\course\\file\\test3.txt"));
			
			System.out.print("문장 1> ");
			String str = scan.nextLine();
			
			System.out.print("문장 2> ");
			String str1 = scan.nextLine();
			String result = (str+"\r\n"+str1);
			bw.write( result);//문자열을 매개변수로 받음			
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
