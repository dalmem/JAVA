package api.lang.stringbuilder;

public class StringBuildEx {
	public static void main(String[] args) {

		//StringBuffer, StringBuilder
		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");

		System.out.println(str);
		System.out.println(sb);

		//차이점
		str = str + "choco";
		sb.append("choco");


		System.out.println(str);
		System.out.println(sb);

		//끝에 문자열 추가
		sb.append("chip");
		System.out.println(sb);

		//중간에 문자열 추가
		sb.insert(4, " ");
		System.out.println(sb);

		//문자열 변경 replace(해당 인덱스 번째를 변경)
		sb.replace(0, 4,"자바");
		System.out.println(sb);

		//문자열 삭제 delete
		sb.delete(2, sb.length());
		System.out.println(sb);

		//문자열 거꾸로 reverse()
		sb.reverse();
		System.out.println(sb);

		//다시거꾸로
		sb.reverse();
		System.out.println(sb);

		//toString()
		if(sb.toString().equals("자바")) {
			System.out.println("문자열이 같음");
		}

	}

}
