package Bronze.Bronze5;

import java.util.*;

public class No_8393_합 {

	public static void main(String[] args) {
		
		// 스캐너 소환
		Scanner sc = new Scanner(System.in);
		
		// N값 입력
		int N;
		N = Integer.parseInt(sc.nextLine());
		
		// 1부터 N까지의 합을 저장할 변수 선언
		int sum = 0;
		
		// 1부터 N까지의 합
		for(int i=1; i<(N+1); i++) {
			sum += i;
		}
		
		// sum 결과값 출력
		System.out.println(sum);
		

	}

}
