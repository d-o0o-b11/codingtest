package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;  //띄어쓰기 기준으로 입력값 받기
		
		int t = Integer.parseInt(br.readLine());  //첫번째 줄 5
		
		int[] arr = new int[t];  //배열 크기 잡는거 생각하기
		
		
		st= new StringTokenizer(br.readLine()); //두번째 줄 20 10 35 30 7
		
		for(int i=0;i<t;i++) {
	
			arr[i]= Integer.parseInt(st.nextToken());
			
			
		}
		
		Arrays.sort(arr);  //배열 정렬
		
		
		System.out.println(arr[0]+" "+arr[t-1]);
		
	}

}
