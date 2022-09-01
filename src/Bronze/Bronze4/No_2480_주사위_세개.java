package Bronze.Bronze4;

import java.util.*;

public class No_2480_주사위_세개 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력값 받기
		String[] tmp = sc.nextLine().split(" ");

		// 주사위 값 3개 분활
		int A, B, C;

		A = Integer.parseInt(tmp[0]);
		B = Integer.parseInt(tmp[1]);
		C = Integer.parseInt(tmp[2]);

		// 주사위 3개 눈금 비교
		if (A == B && B == C) {
			System.out.println(A * 1000 + 10000);
		} else if (A == B || A == C) {
			System.out.println(1000 + A * 100);
		} else if (B == C) {
			System.out.println(1000 + B * 100);
		} else {
			int tmp_n = Math.max(A, B);
			System.out.println(100 * Math.max(tmp_n, C));
		}

	}

}
