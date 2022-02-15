package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stage8_4 {
		/*시간초과*/
	public static void main(String[] args)throws Exception  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		
		
		int count=1;
		int i=0;
		
		
		int result=A;//2
		
		while(true) {
			if(result<V) { //2<V
				result = result-B; //2-1=1
				result+=A;
				count++;
			}
			else
				break;
		}
		
		System.out.println(count);
	}

}
