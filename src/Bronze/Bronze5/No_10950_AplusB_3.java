package Bronze.Bronze5;

import java.util.*;

public class No_10950_AplusB_3 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 개수 T 값 입력
		int T = Integer.parseInt(sc.nextLine());
//		System.out.println();

		// A, B값 입력 및 A+B값 출력
		int A, B;

		for (int i = 0; i < T; i++) {

			String[] tmp = sc.nextLine().split(" ");

			A = Integer.parseInt(tmp[0]);
			B = Integer.parseInt(tmp[1]);

			System.out.println(A + B);
		}

	}

}
