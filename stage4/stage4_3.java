package stage4;

import java.io.*;
import java.util.StringTokenizer;

public class stage4_3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count=0;
		
		int num = Integer.parseInt(br.readLine());

		int temp = num; //첫번째 값 복사
		
		
		while(true) {
			
			int B = temp/10; //몫 ==십의자리
			int C = temp%10; //나머지 ==일의자리
			int sum=(B+C)%10;
			
			temp=C*10+sum;
			
			count++;
			
			if(temp==num) {
				System.out.println(count);
				break;
			}
			
		}
		
	}
	
}
