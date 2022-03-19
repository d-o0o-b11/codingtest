package stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stage11_3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
	BufferedReader br =	new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	int n = Integer.parseInt(br.readLine());
	int x[] = new int[n];
	int y[] = new int[n];
	int rank[] = new int[n];
	
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			x[i]=Integer.parseInt(st.nextToken());
			y[i]=Integer.parseInt(st.nextToken());
			rank[i]=1;
			
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)
					continue;
				else if(x[i]<x[j] && y[i]<y[j])
					rank[i]++;
			}
		}
	
		for(int i=0;i<n;i++) {
			System.out.print(rank[i]+" ");
		}
	
	}

}
