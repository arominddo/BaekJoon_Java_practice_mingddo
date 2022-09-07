package Bronze.Bronze5;

import java.util.*;

public class No_2438_별_찍기_1 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// N값 입력
		int N = Integer.parseInt(sc.nextLine());

		// 별 N줄 출력
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

}
