package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;  //띄어쓰기 기준으로 입력값 받기
		
		
		int[] arr = new int[9];  
		
		int max=0;
		int index=0;
		
		
		for(int i=0;i<9;i++) {
	
			arr[i]= Integer.parseInt(br.readLine());
			if(max<arr[i]) {
				max=arr[i];
				index=i;
				
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
		
	}

}
