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
			
			if(store>='A' && store<='Z') //�빮�ڸ�
				store+=32; //�ҹ��ڷ� ��ȯ
			
			//System.out.println(store);
			
				arr[store-'a']++;
			
		}

		/*check*/
		
		
		
		int count=0;
		int max=0;
		int temp=0;
		char result=' ';
		//�ִ밪 ã��
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]>temp) { //temp���� ũ�� max
				temp=arr[i];
				max=arr[i];
				result= (char)(i+65);
				
				
			}
			else if(max==arr[i]) //���� ���� ���� ���ĺ��� ���� �� �����ϴ� ���
				result='?';
			
		}
		
			System.out.println(result);
		
	}

}
