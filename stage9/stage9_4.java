package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stage9_4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		
		boolean arr[]= new boolean[1000001];
		Arrays.fill(arr, false);
		
		arr[1]=true;
		
		int A= Integer.parseInt(st.nextToken()); //3
		int B= Integer.parseInt(st.nextToken()); //16
		
		for(int i=2;i<=B;i++) {
			for(int j=2;j*i<=B;j++) {
				arr[i*j]=true;
			}
		}
		
		for(int i=A;i<=B;i++) {
			if(arr[i]==false)
				System.out.println(i);
		}
		
	}

}
