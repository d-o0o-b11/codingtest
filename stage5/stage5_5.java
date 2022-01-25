package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int sum=0;
		
		float max=0;
		
		int t = Integer.parseInt(br.readLine());
		
		float[] arr=new float[t];
		
		st=new StringTokenizer(br.readLine());  //한줄!!
		
		for(int i=0;i<t;i++) {
			
			arr[i]=Float.parseFloat(st.nextToken()); //점수 받아오기
			
			if(max<arr[i]) {
				max=arr[i];
			}
			sum+=arr[i];
		}
		
	
		System.out.println((sum/max)*100.0/t);
	}

}
