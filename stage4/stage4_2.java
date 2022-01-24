package stage4;

import java.io.*;
import java.util.StringTokenizer;

public class stage4_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();  //값 출력할 때 사용
		StringTokenizer st;
		
		String str;
		
		
		while((str=br.readLine())!=null) {
		
			st= new StringTokenizer(str," ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(A+B).append("\n");  //append 이용해서 값 붙일 수 있다
			//System.out.println(A+B);  → 런타임 에러
			
		}
		System.out.print(sb);
		
	}
	
}
