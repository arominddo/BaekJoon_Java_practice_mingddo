package Bronze.Bronze3;

import java.util.*;

public class No_2525_오븐시계 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력 값 받기
		String[] tmp = sc.nextLine().split(" ");

		// 시값 분값 입력
		int h = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);

		// 오븐 소요 시간 입력 받기
		int t = sc.nextInt();

		// 소요 시간을 시간단위로 환산
		int t_h = t / 60;
		int t_m = t % 60;

		// 시간 계산
		h += t_h;
		m += t_m;

		// 옳바른 시간으로 변환
		if (m >= 60) {
			h++;
			m -= 60;
		}

		h %= 24;

		System.out.println(h + " " + m);

	}

}
