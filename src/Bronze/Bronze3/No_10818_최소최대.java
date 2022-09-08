package Bronze.Bronze3;

import java.util.*;

public class No_10818_최소최대 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// N값 입력
		int N = Integer.parseInt(sc.nextLine());

		// N개의 정수를 담을 배열 생성
		int[] li_N = new int[N];

		// N개의 정수 입력 및 저장
		String[] tmp = sc.nextLine().split(" ");

		for (int i = 0; i < N; i++) {
			li_N[i] = Integer.parseInt(tmp[i]);
		}

		// 최대 최소 출력

		Arrays.sort(li_N);

		int min = li_N[0];
		int max = li_N[N - 1];

		System.out.println("" + min + " " + max);
		
		sc.close();

	}

}
