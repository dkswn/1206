package APIclass;

public class Main6 {

	public static void main(String[] args) {
		String ssn = "870913-1234567";
		
		String firstNum = ssn.substring(0,6);  // 인덱스 0부터 5번째까지
		String secondNum = ssn.substring(7); // 인덱스 7번 부터 뒤쪽 전체
		
		System.out.println("firstNum : " + firstNum );
		System.out.println("secondNum : " + secondNum );
	}

}
