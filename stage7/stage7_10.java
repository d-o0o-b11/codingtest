package stage7;

import java.io.*;
import java.util.StringTokenizer;

public class stage7_10 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int arr[] =new int[27];
		int count=0;
		int result=0;
		
		
		
		
		for(int i=0;i<num;i++) {//3
			count=0;
			String word = br.readLine();
			
			if(word.length()==1) {
				count++;
				result++;
			}
			else {
				for(int j=0;j<word.length();j++) { //happy
					if(j>0) {
						if(arr[word.charAt(j)-'a']!=0 && word.charAt(j-1)!=word.charAt(j)) {
							count++;
						}
					}
					
						arr[word.charAt(j)-'a']++;
						
						
				}
				if( count==0)
					result++;
				
				
			}
			
			for(int k=0;k<arr.length;k++)
				arr[k]=0;
			
		}
		
		System.out.println(result);
	}

}
