package APIclass;

import java.util.StringTokenizer;

public class Main11 {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();  // 첫번째 칸은 비어있다 
		for(int i = 0; i< countTokens; i++) {// 범위체크 
			String token = st.nextToken(); // 메모리에 있는 token을 하나씩 이동 
			System.out.println(token);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {  // 남아있는 토큰이 있는지 여부 boolean // token이 비어있으면 false
			String token = st.nextToken(); // 첫번째 칸은 비어있기 때문에 st.nextToken 호출해서 한칸씩 옆으로 가게 해줘야함
			System.out.println(token);
		}
	}

}
