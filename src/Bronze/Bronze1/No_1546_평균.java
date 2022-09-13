package Bronze.Bronze1;

import java.util.*;

public class No_1546_평균 {

	public static void main(String[] args) {
		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 시험 과목 수 N
		int N = Integer.parseInt(sc.nextLine());

		// 성적 입력
		String[] tmp = sc.nextLine().split(" ");

		// 성적 조작 점수 리스트 생성
		String[] re_score = new String[tmp.length];

		// 최댓값 및 기존 평균 구하기
		double score_max = 0;
		double score_mean = 0;

		for (String i : tmp) {
			double num_tmp = Integer.parseInt(i);
			if (num_tmp > score_max) {
				score_max = num_tmp;
			}
			score_mean += num_tmp;
		}

		score_mean /= (double) tmp.length;

		// 새로운 성적 평균 구하기
		double result = (double)100 * (double)score_mean / (double)score_max;

		System.out.printf("%f", result);

	}

}
