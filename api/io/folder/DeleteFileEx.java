package api.io.folder;

import java.io.File;

public class DeleteFileEx {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\course\\file\\test_folder");
			
			if(file.exists()) {//폴더가 존재하면 삭제.
				file.delete();//delete성공시 true반환, delete실패시 false를 반환
				System.out.println("폴더가 삭제 되었습니다");
			}else
				System.out.println("삭제 실패");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
