package APIclass;

import java.util.Arrays;

public class Main15 {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);  // 숫자 배열을 작은 수 부터 정렬 
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]" + scores[i]);
		}

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);  // 문자를 가나다 순으로 정렬 
		for (int i = 0; i < names.length; i++) {
			System.out.println("name[" + i + "]" + names[i]);
		}
	}
}
