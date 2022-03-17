package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stage11_1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		
		int result=0;
		int check=0;
		int arr[] = new int[n];
		
		st= new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					result = arr[i] + arr[j] + arr[k];
					
					if(result==max) {
						System.out.println(result);
						return;
					}
					
					if(result>check && result<max)
						check=result;
				}
			}
		}
		System.out.println(check);
		
	}

}
