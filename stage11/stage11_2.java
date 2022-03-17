package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stage11_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result=0;
		
		for(int i=0;i<n;i++) {
			int num = i;
			int sum = 0;
			
			while(num!=0) {
				sum+=num%10;
				num/=10;
			}
			
			if(i+sum == n) {
				//System.out.println(i); 여기서 출력하면 왜 오류가 뜰까,,
				result=i;
				break;
			}
			
		}
		
		System.out.println(result);
		
	}

}
