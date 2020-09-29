
package quiz25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StreamQuiz02 {
	public static void main(String[] args) {
		
		/*
		 * 1. Date클래스를 이용해서 file경로에서 오늘날짜 ex)20200928.txt이름으로 파일을 씁니다
		 * 2. 내용은 아무거나 작성
		 * 3. 파일을 정상적으로 썼다면, BufferedReader를 이용해 파일을 읽어오세요
		 */
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Scanner scan = new Scanner(System.in);
		String filename = sdf.format(dt);
		BufferedWriter bw=null;
		BufferedReader bf=null;
		try {
			bw = new BufferedWriter(new FileWriter("D:\\course\\file\\"+filename+".txt"));
			bf = new BufferedReader(new FileReader("D:\\course\\file\\"+filename+".txt"));
			System.out.print("문장 작성 > ");
			String str = scan.nextLine();
			String strr = null;
			bw.write(str);
			bw.flush();
			
			while((strr= bf.readLine())!= null) {
				System.out.println(strr);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				bf.close();
				scan.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
