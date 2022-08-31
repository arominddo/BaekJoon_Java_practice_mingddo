package Bronze.Bronze5;

import java.util.*;

public class No_10430_나머지 {

	public static void main(String[] args) {
		
		// 스캐너 소환
		Scanner sc = new Scanner(System.in);
		
		// A,B,C 입력받기
		String[] tmp = sc.nextLine().split(" ");
		
		int A,B,C;
		
		A = Integer.parseInt(tmp[0]);
		B = Integer.parseInt(tmp[1]);
		C = Integer.parseInt(tmp[2]);
		
		// 첫째줄에 (A+B)%C
		System.out.println((A+B)%C);
		
		
		// 둘째줄에 ((A%C) + (B%C))%C
		System.out.println(((A%C) + (B%C))%C);
		
		// 첫째줄에 (AxB)%C
		System.out.println((A*B)%C);
		
		// 첫째줄에 ((A%C) × (B%C))%C
		System.out.println(((A%C) * (B%C))%C);
		

	}

}
