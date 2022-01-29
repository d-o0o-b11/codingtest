package stage6;

import java.io.*;


public class stage6_3 {

	
	public static void main(String[] args)throws Exception {	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result=99;
		
		if(n<100) //2자리수는 무조건 한수다!!
			System.out.println(n);
		else {
			for(int i=100;i<=n;i++) {
				result+=abc(i);  //한수의 개수
			}
			System.out.println(result);
		}
		
		
		
	}
	
	public static int abc(int n) {
		int num1=n/100;
		int num2=(n%100)/10;
		int num3=(n%100)%10;
		
		if(num2*2==num1+num3)
			return 1;
		return 0;
	}
	
}

