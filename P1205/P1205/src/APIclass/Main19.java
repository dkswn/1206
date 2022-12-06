package APIclass;

public class Main19 {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");  // integer 타입 외에는 에러뜸
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
	} 		// 문자열을 기본 타입으로 전환 

}
