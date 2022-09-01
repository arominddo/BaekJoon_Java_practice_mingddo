package Bronze.Bronze5;

import java.util.*;

public class No_2753_윤년 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력값 받기
		int N = sc.nextInt();

		// 윤년 판단 및 결과 출력
		if ((N % 400 == 0) || ((N % 4 == 0) && (N % 100 != 0))) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
