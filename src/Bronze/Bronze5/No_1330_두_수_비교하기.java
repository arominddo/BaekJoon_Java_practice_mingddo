package Bronze.Bronze5;

import java.util.*;

public class No_1330_두_수_비교하기 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력값 받아 배열에 저장
		String[] tmp = sc.nextLine().split(" ");

		// A값 B값 저장
		int A = Integer.parseInt(tmp[0]);
		int B = Integer.parseInt(tmp[1]);

		// A값 B값 비교 및 결과 출력
		if (A > B) {
			System.out.println(">");
		} else if (A == B) {
			System.out.println("==");
		} else {
			System.out.println("<");
		}

	}

}
