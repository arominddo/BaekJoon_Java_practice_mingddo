package Bronze.Bronze5;

import java.util.*;

public class No_1000_AplusB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine();
		
		String[] tmp_li = tmp.split(" ");
		
		int A;
		int B;
		
		A =  Integer.parseInt(tmp_li[0]);
		B = Integer.parseInt(tmp_li[1]);
		
		System.out.println(A+B);
		

	}

}
