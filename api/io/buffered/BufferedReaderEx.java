package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		
		
		/*
		 * BufferedReader
		 */
	
		BufferedReader bf =null;
		try {
			//system.in을 통해서 키보드로부터 값을 받을수도 있습니다.
			//bf = new BufferedReader(new InputStreamReader(System.in));
			bf = new BufferedReader(new FileReader("D:\\course\\file\\test3.txt"));
			

//			System.out.println(bf.readLine());
//			System.out.println(bf.readLine());
//			System.out.println(bf.readLine());
			String str = "";
			while((str = bf.readLine()) != null) {//readLine() - 한줄을 통째로 읽어서 가져옵니다.							
				System.out.println(str);
			}			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
