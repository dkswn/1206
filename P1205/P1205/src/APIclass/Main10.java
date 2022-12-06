package APIclass;

public class Main10 {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-simon";
		
		String[] names = text.split("&|,|-"); //&거나 콤마(,)거나 -로 자른다는 의미
		for(String name : names) {
			System.out.println(name);
		}
	}

}
