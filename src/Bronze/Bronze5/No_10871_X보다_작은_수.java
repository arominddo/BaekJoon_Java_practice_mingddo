package Bronze.Bronze5;

import java.util.*;

public class No_10871_X보다_작은_수 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// N값 X값 입력
		String[] tmp = sc.nextLine().split(" ");

		int N = Integer.parseInt(tmp[0]);
		int X = Integer.parseInt(tmp[1]);

		// 수열 A 리스트 생성
		int[] li_A = new int[N];

		// 수열 A값 입력 및 리스트에 저장
		String[] tmp_A = sc.nextLine().split(" ");

		for (int i = 0; i < tmp_A.length; i++) {
			li_A[i] = Integer.parseInt(tmp_A[i]);
		}

		// X보다 작은 수 출력
		boolean first_check = true;

		for (int i = 0; i < N; i++) {
			if (li_A[i] < X) {
				if (first_check) {
					System.out.print(li_A[i]);
					first_check = false;
				} else {
					System.out.print(" " + li_A[i]);
				}
			}
		}

	}

}
