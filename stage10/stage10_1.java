package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stage10_1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(Fac(num));
		
	}
	
	public static int Fac(int n) {
		
		if(n>1) {
			return n*Fac(n-1);
		}
		else
			return 1;
		
		
	}

}
