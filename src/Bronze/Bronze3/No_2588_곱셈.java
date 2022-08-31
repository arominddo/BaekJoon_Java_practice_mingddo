package Bronze.Bronze3;

import java.util.*;

public class No_2588_곱셈 {

	public static void main(String[] args) {

		// scanner 소환
		Scanner sc = new Scanner(System.in);

		// (1)번 자리 숫자 받기
		int num_1 = Integer.parseInt(sc.nextLine());

		// (2)번 자리 숫자 및 자릿수 별 숫자 배열 생성
		String tmp_num2 = sc.nextLine();
		String[] tmp_num2_li = tmp_num2.split("");
		
		int num_2 = Integer.parseInt(tmp_num2);
		int num_2_1 = Integer.parseInt(tmp_num2_li[2]);
		int num_2_2 = Integer.parseInt(tmp_num2_li[1]);
		int num_2_3 = Integer.parseInt(tmp_num2_li[0]);

		

		// (3)번자리 값 출력
		System.out.println(num_1*num_2_1);
		

		// (4)번자리 값 출력
		System.out.println(num_1*num_2_2);

		
		// (5)번자리 값 출력
		System.out.println(num_1*num_2_3);

		// (6)번자리 값 출력
		System.out.println(num_1*num_2);

	}

}
