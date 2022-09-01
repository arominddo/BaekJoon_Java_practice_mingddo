package Bronze.Bronze3;

import java.util.*;

public class No_2884_알람시계 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 시, 분 입력 받기
		String[] tmp = sc.nextLine().split(" "); // 입력 값 받기

		int h = Integer.parseInt(tmp[0]); // 시 값 입력

		int m = Integer.parseInt(tmp[1]); // 분 값 입력

		// 45분 줄이기
		m -= 45;

		// 올바른 시간으로 바꾸기
		if (m < 0) {
			m = 60 + m;
			h -= 1;
		}

		if (h < 0) {
			h = 23;
		}

		// 시간표현
		System.out.println(h + " " + m);

	}

}
