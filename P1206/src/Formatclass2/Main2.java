package Formatclass2;
import java.text.MessageFormat;
public class Main2 {

	public static void main(String[] args) {
		String id = "java";
		String name = "홍길동";
		String tel = "010-123-4567";
		
		String text = "회원 ID: {0} \n회원이름: {1}\n회원 전화: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sq1 = "insert into member value({0}, {1}, {2})";
		Object[] arguments = {"java", "홍길동", "010-123-4567"};
		String result2 = MessageFormat.format(sq1, arguments);
		System.out.println(result2);

	}

}
