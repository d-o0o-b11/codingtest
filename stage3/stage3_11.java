package stage3;

import java.io.*;
import java.util.StringTokenizer;


public class stage3_11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st= new StringTokenizer(br.readLine());  //1��° �� [����]����
		
		int t= Integer.parseInt(st.nextToken());  //test �
		int num= Integer.parseInt(st.nextToken());  //���� ����
		
		st= new StringTokenizer(br.readLine());  //2��° �� [����]����
		
		for(int i=0;i<t;i++) {
			int arr = Integer.parseInt(st.nextToken());
			if(arr<num)
				System.out.print(arr+" ");
		}
		
	}
	

}
