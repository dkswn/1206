package APIclass;

public class Main18 {
	public static void main(String[] args) {
	//자동 Boxing
		Integer obj = 100; // 우항 참조타입 변수 좌항 integer타입 가능
		System.out.println("value : " + obj.intValue());
		
		//대입 시 지동 Unboxing
		int value = obj;  // 좌항 int 타입 변수 좌항 참조변수 가능 
		System.out.println("value :" + value);
		
		// 연산 시 자동 Unboxing
		int result = obj + 100; // 좌항 int 타입 변수 좌항 참조타입변수 + int 타입 정수
		System.out.println("result" + result);

	}

}
