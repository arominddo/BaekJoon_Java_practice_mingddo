package Silver.Silver5;

import java.util.*;
import java.io.*;

public class No_2869_달팽이는_올라가고_싶다 {

	public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        
        int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int cnt;
		cnt = (V-A)/(A-B)+1;
        
        if((V-B) %(A-B) != 0){
            cnt++;
        }

		System.out.println(cnt);

	}

}

/*

intput : 2 1 5

output : 4


*/