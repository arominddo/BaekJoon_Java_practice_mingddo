package Bronze.Bronze4;

import java.io.*;
import java.util.*;

public class No_15552_빠른AplusB {

	public static void main(String[] args) throws IOException {

		// 버퍼리더, 버퍼라이터 소환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트 케이스 수 입력
		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		// A와 B 입력 및 A+B 값 출력
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			bw.write(A + B + "\n");

		}

		br.close();
		bw.flush();
		bw.close();

	}

}
