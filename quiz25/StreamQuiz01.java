package quiz25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class StreamQuiz01 {
	

	public static void main(String[] args) {
	
		/*
		 * 1. 스캐너를 통해서 파일명을 입력받습니다.
		 * 2. upload폴더에 해당 파일이 있다면, 해당파일을 uploadcopy폴더로 복사,
		 * 		파일명이 없으면 "파일이 없습니다" 예외구문을 출력
		 * 
		 * 3. 복사도중 에러가 발생하면, "파일 처리중 예외발생" 구문 출력
		 */

		Scanner scan = new Scanner(System.in);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int result;

		try {
			System.out.print("생성할 파일명 > ");
			String filename = scan.next();
			fis = new FileInputStream("D:\\course\\file\\upload\\"+filename);
			fos = new FileOutputStream("D:\\course\\file\\uploadcopy\\"+filename);

			byte[] arr = new byte[100];
			while ( (result = fis.read(arr))!=-1 ) {
				
				fos.write(arr, 0, result);
			}


		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
			
		} catch(IOException e){
			System.out.println("파일을 읽는 도중 에러발생");
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}

		

	}

}