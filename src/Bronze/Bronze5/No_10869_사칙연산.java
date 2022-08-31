package Bronze.Bronze5;

import java.util.*;

public class No_10869_사칙연산 {

	public static void main(String[] args) {
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력 1째줄 받아서 구분 단어 별 배열 저장
		String[] tmp = sc.nextLine().split(" ");
		
		// A, B 값 지정
		int A, B;
		
		A = Integer.parseInt(tmp[0]);
		B = Integer.parseInt(tmp[1]);
		
		//첫째 줄에 A+B 출력
		System.out.println(A+B);
		//둘째 줄에 A-B 출력
		System.out.println(A-B);
		//셋째 줄에 A*B 출력
		System.out.println(A*B);
		//넷째 줄에 A/B 출력
		System.out.println(A/B);
		//다섯째 줄에 A%B 출력
		System.out.println(A%B);
		
		

	}

}
