package quiz25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StreamQuiz03 {
	public static void main(String[] args) {
		/*
		 * 1. Date 클래스를 이용해서 file경로에 하위폴더로 오늘날짜 20200928file폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 파일명.txt파일로 파일을 씁니다
		 * 3. exit를 입력받을 때 까지 엔터를 포함해서 실시간으로 입력받습니다
		 * 
		 * 4.exit로 파일이 써졌다면, 아무 방법으로나 파일을 읽어들이세요.
		 */
		//-----------------------------날짜 선언------------------------------------------------------------
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		//------------------------------------------------------------------------------------------------
		//-------------------------------파일명, 폴더명 설정---------------------------------------------------
		Scanner scan = new Scanner(System.in);
		String folder = sdf.format(dt);
		System.out.print("파일명 > ");
		String filename = scan.next();
		//-------------------------------------------------------------------------------------------------
		//-----------------------------Buffered선언 ---------------------------------------------------------
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			//---------------------------------------------------------------------------------------------
			File file = new File("D:\\course\\file\\"+folder+"file");
			if(!file.exists()) {//해당파일이 존재하면 true, 존재하지 않으면 false
				file.mkdir();//폴더생성
				System.out.println("폴더 생성 완료");
			}else {
				System.out.println("해당 폴더가 이미 존재합니다.");
			}			
			FileWriter pathw = new FileWriter("D:\\course\\file\\"+folder+"file\\"+filename+".txt");
			bw = new BufferedWriter(pathw);				
			scan.nextLine();
			//----------------------------------------------------------------------------------------------
			//--------------------------폴더 생성 실행문--------------------------------------------------------
			
			//----------------------------------------------------------------------------------------------
			//-----------------------------------문장작성 반복문------------------------------------------------
			while(true) {
				System.out.print("문장 작성 >>> ");
				String str = scan.nextLine();
				if(str.equals("exit"))break;
				bw.write(">> " +str);
				bw.write("\r\n");	
				bw.flush();
				
			}
				
			//----------------------------------------------------------------------------------------------
			//-----------------------------------파일 읽기 반복문------------------------------------------------
			FileReader pathr = new FileReader("D:\\course\\file\\"+folder+"file\\"+filename+".txt");
			br = new BufferedReader(pathr);
			String strr;
			while((strr = br.readLine())!= null) {
				System.out.println(strr);
			}
			//-----------------------------------------------------------------------------------------------
			//-----------------------------------------------------------------------------------------------
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			//-----------------------------------------------------------------------------------------------
			//--------------------------------파일 닫기--------------------------------------------------------
			try {
				bw.close();
				br.close();
				scan.close();
				//-------------------------------------------------------------------------------------------
				//-------------------------------------------------------------------------------------------
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		}
}
