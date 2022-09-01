package Bronze.Bronze5;

import java.util.*;

public class No_2739_구구단 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력값 받기
		int N = sc.nextInt();

		// 구구단 출력
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", N, i, N * i);
		}

	}

}
