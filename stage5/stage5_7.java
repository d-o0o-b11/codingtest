package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		Double[] scores = new Double[t];
		
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(br.readLine());
			
			int t2= Integer.parseInt(st.nextToken());
			
			int[] arr = new int[t2];
			int sum=0;
			double count=0;
			
			for(int j=0;j<t2;j++) {
				arr[j]= Integer.parseInt(st.nextToken());
				
				sum+=arr[j];
				
				
				
			}
			//scores[i]=sum/t2;
			
			for(int k=0;k<t2;k++) {
				
				if(arr[k]>sum/t2)  //평균보다 큰 점수가진 사람수
					count++;
					
			}
			
			scores[i] = (count/t2)*100;
			
		}
		
		for(int h=0;h<t;h++) {
			System.out.printf("%.3f%%\n",scores[h]);  //소수점아래 3자리수
		}
		
	}

}
