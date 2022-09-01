package Bronze.Bronze5;

import java.util.*;

public class No_9498_시험_성적 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력 값 저장
		int score = sc.nextInt();

		// 점수 비교 및 성적 출력
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;

		}

	}

}
