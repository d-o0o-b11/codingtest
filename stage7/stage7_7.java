package stage7;

import java.io.*;
import java.util.StringTokenizer;

public class stage7_7 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int arr[]= new int[2];
		
		st= new StringTokenizer(br.readLine());
		
		
		for(int i=0;i<2;i++) {
			
			arr[i]= (arr[i]/100)+ ((arr[i]%100)/10)*10 +((arr[i]%100)%10)*100;
		}
		
		
		if(arr[0]>arr[1])
			System.out.println(arr[0]);
		else
			System.out.println(arr[1]);
	}

}
