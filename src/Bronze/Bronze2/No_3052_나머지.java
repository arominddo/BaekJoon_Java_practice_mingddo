package Bronze.Bronze2;

import java.util.*;

public class No_3052_나머지 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 수 배열 입력 받기
		int[] li_N = new int[10];

		for (int i = 0; i < 10; i++) {
			li_N[i] = (Integer.parseInt(sc.nextLine())) % 42;
		}

		// 겹치지 않은 수 카운트 변수
		int cnt = 0;

		// 겹침 여부 판별 리스트
		Vector check_n = new Vector();

		check_n.add(li_N[0]);

		// 겹치는 수 판별
		for (int i = 0; i < 10; i++) {
			boolean ch = false;
			for (int j = 0; j < check_n.size(); j++) {
				if (((int) (check_n.get(j))) == li_N[i]) {
					ch = true;
					break;
				}

			}
			if (ch) {
				continue;
			}
			check_n.add(li_N[i]);

		}

		System.out.println(check_n.size());

	}

}
