package Bronze.Bronze4;

import java.util.*;

public class No_2439_별_찍기_2 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// N값 입력
		int N = Integer.parseInt(sc.nextLine());

		// 별 출력
		for (int i = 1; i < N + 1; i++) {
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

}
