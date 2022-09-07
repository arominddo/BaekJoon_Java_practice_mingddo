package Bronze.Bronze5;

import java.util.*;

public class No_10952_AplusB_5 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력 값 입력 및 출력

		while (true) {

			String[] tmp = sc.nextLine().split(" ");

			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);

			if (a == 0 && b == 0)
				break;

			System.out.println(a + b);

		}

	}

}
