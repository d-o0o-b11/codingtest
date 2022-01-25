package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		
		String[]arr = new String[t];
		int []score= new int[t];
		
		for(int i=0;i<t;i++) {
			arr[i]=br.readLine();
		}
		
		for(int i=0;i<t;i++) {
			int count=0;
			int sum=0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') //charAt : String타입으로 저장된 문자열을 한 글자만 선택해서 char타입으로 변환
					count++;
				else
					count=0;
				
				sum+=count;
				
			}
				score[i]=sum;
		}
		
		for(int i=0;i<t;i++)
		System.out.println(score[i]);
		
	}

}
