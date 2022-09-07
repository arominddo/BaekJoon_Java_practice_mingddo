package Bronze.Bronze5;

import java.util.*;

public class No_25304_영수증 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 변수 설정
		int price; // 영수증 가격
		int sum = 0; // 영수증 항목 합계
		int product; // 구매 항목 갯수

		// 영수증 기입 가격 입력
		price = Integer.parseInt(sc.nextLine());

		// 구매 항목 갯수 입력
		product = Integer.parseInt(sc.nextLine());

		// 구매 항목 금액 합계 구하기
		for (int i = 0; i < product; i++) {
			String[] tmp = sc.nextLine().split(" ");
			int a = Integer.parseInt(tmp[0]);

			int b = Integer.parseInt(tmp[1]);

			sum += (a * b);
		}

		// 금액 비교하기

		if (sum == price) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}

	}

}
