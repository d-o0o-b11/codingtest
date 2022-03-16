package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stage10_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(Fn(num));
		
	}
	
	public static int Fn(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return Fn(n-1) + Fn(n-2);
	}

}
