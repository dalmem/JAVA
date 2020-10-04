package quiz27;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaQuiz02 {
	public static void main(String[] args) {

		/*
		 * 1. BufferedReader로 파일읽기
		 * 2.수출입구분 "수출" 항목의 "오징어"가 포함되어 있는 데이터만 구분해서
		 * 	해당 데이터의 총합계 를 구하세요
		 */
		BufferedReader bf=null;
		List<Data> list = new ArrayList<Data>();
		try {
			bf= new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JAVA\\eclipse\\java\\해양수산부_수산물 품목별 수출입 현황 - 2020년 02월(월간).csv"),"EUC-KR"));
			String str;
			int hang=0;
			while( (str= bf.readLine())!=null) {

				String[] arr = str.split(",",10); //5칸으로 자르기
				
				String year = arr[0];
				String name = arr[3];
				String sb= arr[4];
				String monthmn= arr[5];
				String monthud= arr[6];
				String yearmn= arr[7];
				String yearud= arr[8];
				hang++;
				arr[0] = arr[0].replace("'", "").replace(",", "").replace("-", "");
				arr[3] = arr[3].replace("'", "").replace(",", "").replace("-", "");
				arr[4] = arr[4].replace("'", "").replace(",", "").replace("-", "");
				arr[5] = arr[5].replace("'", "").replace(",", "").replace("-", "");
				arr[6] = arr[6].replace("'", "").replace(",", "").replace("-", "");
				arr[7] = arr[7].replace("'", "").replace(",", "").replace("-", "");
				arr[8] = arr[8].replace("'", "").replace(",", "").replace("-", "");
				System.out.println(Arrays.toString(arr));
				Data data = new Data(year,name,sb,monthmn,monthud,yearmn,yearud);
				list.add(data);
			}
			System.out.println(list.size());
			List<Data> newList = list.stream().
			filter( (data)-> data.getName().contains("오징어"))
			.collect(Collectors.toList());
			newList.stream().distinct().forEach((s)->System.out.println(Arrays.toString(s)+" "));
			int sum =newList.stream().mapToInt( (data) -> Integer.parseInt(data.getYearud()) ).sum();
			System.out.println(sum);

		} catch (Exception e) {
		}


	}
}
