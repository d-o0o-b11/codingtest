package stage3;

import java.io.*;
import java.util.StringTokenizer;


public class stage3_11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st= new StringTokenizer(br.readLine());  //1번째 줄 [띄어쓰기]기준
		
		int t= Integer.parseInt(st.nextToken());  //test 몇개
		int num= Integer.parseInt(st.nextToken());  //비교할 숫자
		
		st= new StringTokenizer(br.readLine());  //2번째 줄 [띄어쓰기]기준
		
		for(int i=0;i<t;i++) {
			int arr = Integer.parseInt(st.nextToken());
			if(arr<num)
				System.out.print(arr+" ");
		}
		
	}
	

}
