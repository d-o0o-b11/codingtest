package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stage11_5 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int num = Integer.parseInt(br.readLine());
	
	int start = 666;
	int count=1;
	
	while(count!=num) {
		start++;
		if(String.valueOf(start).contains("666")) //start가 666을 포함하고있다면
			count++;
	}
	
	System.out.println(start);
	
	}

}
