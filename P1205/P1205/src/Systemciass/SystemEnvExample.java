package Systemciass;

public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("Path");
		System.out.println("Path :" + javaHome);
	}  // 자바 환경변수 읽기 

}
