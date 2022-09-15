package Silver.Silver5;

import java.util.*;

public class No_2941_크로아티아_알파벳 {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// 입력값 받기
		String word = sc.nextLine();

		// 크로아티 알파벳 리스트
		String[] kro = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		// 판별
		for (String str : kro) {
			word = word.replace(str, "0");
		}

		System.out.println(word.length());

	}

}
