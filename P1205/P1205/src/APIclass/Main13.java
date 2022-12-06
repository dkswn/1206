package APIclass;

public class Main13 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java");
		sb.append("Program study");  // 문자열 끝에 주어진 매개갑을 추가
		System.out.println(sb.toString());
		System.out.println(sb); // toString 생략
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length =sb.length();
		System.out.println("총문자수 : "+ length );
		
		String result = sb.toString();
		System.out.println(result);
	}

}
