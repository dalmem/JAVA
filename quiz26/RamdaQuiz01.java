package quiz26;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RamdaQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. BufferedReader클래스를 사용해서 파일을 읽어들이세요
		 * 2. , 기준으로 잘라서 Data클래스에 값을 한줄 단위로 저장합니다.
		 * 결측치 -> 빠진 값을 적절하게 처리해서 list<Data>에 저장
		 * 3. 람다식을 이용해서, 지역:서울, 짝수 월, 분양가격은 4000이상의 객체만 뽑아서 새로운 리스트에 저장
		 */
		BufferedReader bf=null;
		List<Data1> list = new ArrayList<Data1>();
		try {
			bf= new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\file\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"),"EUC-KR"));
			String str;
			int hang=0;
			while( (str= bf.readLine())!=null) {

				String[] arr = str.split(",",5); //5칸으로 자르기

				hang++;
				//System.out.println(hang);
				//System.out.println(Arrays.toString(arr));
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price ;
				arr[4] = arr[4].replace(" ", "").replace(",", "").replace("-", "");//공백제거, ,제거 , -제거
				if(arr[4].equals(""))//공백이면 0을 저장
					price = "0";
				else
					price = arr[4];


				Data1 data = new Data1(region,size,year,month,price);
				list.add(data);
			}
			System.out.println(list.size());
			List<Data1> newList = list.stream().
			filter( (data)-> data.getRegion().equals("제주"))
			.filter((data)-> Integer.parseInt(data.getMonth())%2==0)
			.filter((data)->Integer.parseInt(data.getPrice())>=4000)
			.collect(Collectors.toList());
			
			int total =0;
			for (Data1 data: newList) {
				System.out.println(data.toString());
				total+=Integer.parseInt(data.getPrice());
			}
			System.out.println(total);
			double average = total/(double)newList.size();
			System.out.println(average);
			
			
			//2. 합계 sum() mapToInt를 사용 -> price값만 IntStream으로 변환 -> 합계메서드 사용
			int sum =newList.stream().mapToInt( (data) -> Integer.parseInt(data.getPrice()) ).sum();//새로운 값을 뽑아서 IntStream반환
			
			//3. 평균 average() mapToInt를 사용 -> price값의 평균을 구한뒤 -> double형 변환
			double avg = newList.stream().mapToInt( (data) -> Integer.parseInt(data.getPrice()) ).average().getAsDouble();
			
			System.out.println(sum);
			System.out.println(avg);
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}
}
