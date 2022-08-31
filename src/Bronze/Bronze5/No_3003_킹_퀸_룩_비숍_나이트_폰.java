package Bronze.Bronze5;

import java.util.*;

public class No_3003_킹_퀸_룩_비숍_나이트_폰 {

	public static void main(String[] args) {
		
		
		// 스캐너 소환
		Scanner sc = new Scanner(System.in);
		
		// 입력 값 받아서 배열에 저장
		String[] tmp = sc.nextLine().split(" ");
		int[] tmp_int = new int[tmp.length];
		
		// 정상 체스 갯수 배열
		int[] ches = {1,1,2,2,2,8}; 
		
		// 출력용 값 배열 생성
		int[] result = new int[tmp.length];
		
		// 배열 값 int형으로 변경 후 필요 갯수 저장
		for (int i = 0 ; i<tmp.length; i++) {
			tmp_int[i] = Integer.parseInt(tmp[i]);
			result[i] =  ches[i]-tmp_int[i];
			System.out.printf("%d ",result[i]);
		}
		
		
		
		

	}

}
