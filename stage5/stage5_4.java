package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;  //���� �������� �Է°� �ޱ�
		
		int[]arr = new int[10];  //�迭 ũ�� �����ϱ�
		int[]store = new int[10];
		
		int count=0;
		
		for(int i=0;i<10;i++) {
			arr[i]=Integer.parseInt(br.readLine()); //�� 10�� �Է¹ޱ�
			
			store[i]=arr[i]%42; //������
			//System.out.println(store[i]);
			
		}
		
		Arrays.sort(store);
		
		for(int i=0;i<10;i++) {
			//System.out.println(store[i]);
			
			if(i==9)
				count++;
			
			else if(store[i]!=store[i+1])
				count++;
		}
		
		System.out.println(count);
		
		
		
		
			
		
	}

}
