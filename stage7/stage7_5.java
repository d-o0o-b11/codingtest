package stage7;

import java.io.*;
import java.util.StringTokenizer;

public class stage7_5 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		int arr[]= new int[26];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		for(int i=0;i<num.length();i++) {
			char store = num.charAt(i);
			
			if(store>='A' && store<='Z') //대문자면
				store+=32; //소문자로 변환
			
			//System.out.println(store);
			
				arr[store-'a']++;
			
		}

		/*check*/
		
		
		
		int count=0;
		int max=0;
		int temp=0;
		char result=' ';
		//최대값 찾기
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]>temp) { //temp보다 크면 max
				temp=arr[i];
				max=arr[i];
				result= (char)(i+65);
				
				
			}
			else if(max==arr[i]) //가장 많이 사용된 알파벳이 여러 개 존재하는 경우
				result='?';
			
		}
		
			System.out.println(result);
		
	}

}
