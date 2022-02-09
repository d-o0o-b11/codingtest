package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stage8_2 {

	public static void main(String[] args)throws Exception  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count=1;
		int sum=7;
		
		while(true) {
			
			
			if(num==1) {
				System.out.println("1");
				break;
			}
			else {
				if(num<=sum) {
					System.out.println(count+1);
					break;
				}
				count++;
				sum=sum+(6*count); 
			}
			
			
		}
		
	}

}
