package stage7;

import java.io.*;
import java.util.StringTokenizer;

public class stage7_4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine()); //2
		
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(br.readLine());
			
			int num= Integer.parseInt(st.nextToken());  //3
			
			String a = st.nextToken();  //ABC
			
			//System.out.println(a);
			
			for(int j=0;j<a.length();j++) {
				for(int k=0;k<num;k++)
					System.out.print(a.charAt(j));
			}
			
			System.out.println("");
		}

	}

}
