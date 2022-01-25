package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;  //띄어쓰기 기준으로 입력값 받기
		
		int[]arr = new int[10];  //배열 크기 생각하기
		int[]store = new int[10];
		
		int count=0;
		
		for(int i=0;i<10;i++) {
			arr[i]=Integer.parseInt(br.readLine()); //값 10개 입력받기
			
			store[i]=arr[i]%42; //나머지
			//System.out.println(store[i]);
			
		}
		
		Arrays.sort(store);
		
		for(int i=0;i<10;i++) {
			//System.out.println(store[i]);
			
			if(i==9)
				count++;
			
			else if(store[i]!=store[i+1])
				count++;
		}
		
		System.out.println(count);
		
		
		
		
			
		
	}

}
