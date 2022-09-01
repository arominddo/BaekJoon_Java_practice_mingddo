package Bronze.Bronze5;

import java.util.*;

public class No_14681_사분면_고르기 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// x값, y값 받기
		int x = sc.nextInt();
		sc.nextLine();
		int y = sc.nextInt();

		// 4분면 판단하기
		if (x > 0 && y > 0) {
			System.out.println("1");
		} else if (x < 0 && y > 0) {
			System.out.println("2");
		} else if (x < 0 && y < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}

	}

}
