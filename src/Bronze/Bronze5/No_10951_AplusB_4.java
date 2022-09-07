package Bronze.Bronze5;

import java.util.*;

public class No_10951_AplusB_4 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력 값 입력 및 출력

		while (true) {

			try {
				String[] tmp = sc.nextLine().split(" ");

				int a = Integer.parseInt(tmp[0]);
				int b = Integer.parseInt(tmp[1]);

				System.out.println(a + b);
			} catch (Exception e) {
				break;
			}

		}

		sc.close();

	}

}
