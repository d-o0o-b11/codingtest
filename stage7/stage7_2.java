package stage7;

import java.io.*;

public class stage7_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int sum =0;
		
		for(int i=0;i<num;i++) {
			sum+=br.read()-48;
		}
	
		System.out.println(sum);
	}

}
