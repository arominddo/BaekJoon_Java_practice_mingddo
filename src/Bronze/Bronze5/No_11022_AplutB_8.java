package Bronze.Bronze5;

import java.util.*;

public class No_11022_AplutB_8 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 값 T로 입력
		int T = Integer.parseInt(sc.nextLine());

		// 테스트 케이스 입력 및 출력

		for (int i = 0; i < T; i++) {
			String[] tmp = sc.nextLine().split(" ");

			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);

			System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));

		}

	}

}
