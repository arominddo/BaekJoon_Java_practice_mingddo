package Bronze.Bronze3;

import java.util.*;

public class No_2562_최댓값 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 수 배열 받을 리스트 생성
		int[] li_N = new int[9];

		// 수 입력 받기
		for (int i = 0; i < 9; i++) {
			li_N[i] = Integer.parseInt(sc.nextLine());
		}

		// 최댓값 구하기
		int[] li_N_copy = li_N.clone();

		Arrays.sort(li_N_copy);

		int max = li_N_copy[8];

		// 최댓값 위치 구하기
		int index_max = 0;
		for (int i = 0; i < 9; i++) {
			if (li_N[i] == max) {
				index_max = i+1;
				break;
			}
		}

		// 결과 출력
		System.out.println(max);
		System.out.println(index_max);

	}

}
