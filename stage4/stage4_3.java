package stage4;

import java.io.*;
import java.util.StringTokenizer;

public class stage4_3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count=0;
		
		int num = Integer.parseInt(br.readLine());

		int temp = num; //ù��° �� ����
		
		
		while(true) {
			
			int B = temp/10; //�� ==�����ڸ�
			int C = temp%10; //������ ==�����ڸ�
			int sum=(B+C)%10;
			
			temp=C*10+sum;
			
			count++;
			
			if(temp==num) {
				System.out.println(count);
				break;
			}
			
		}
		
	}
	
}
