package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;  //���� �������� �Է°� �ޱ�
		
		int[] count = new int[10];
		
		
		
		int[] arr = new int[3];
		int q=1;  //���� ���
		
		for(int i=0;i<3;i++) { //�� ���� �ڿ��� ��
			arr[i]=Integer.parseInt(br.readLine());
			q*=arr[i];
		}
		
		int quo=0;  //��
		int rest=q; //������
		
		int k= (int)(Math.log10(q));
		
		for(int j=0;j<(int)(Math.log10(q)+1);j++) {
			quo = rest/(int)Math.pow(10, k);
			rest = rest%(int)Math.pow(10, k);
			k--;
			
			switch(quo) {
			case 0:
				count[0]++;
				break;
				
			case 1:
				count[1]++;
				break;
				
			case 2:
				count[2]++;
				break;
				
			case 3:
				count[3]++;
				break;
				
			case 4:
				count[4]++;
				break;
				
			case 5:
				count[5]++;
				break;
				
			case 6:
				count[6]++;
				break;
				
			case 7:
				count[7]++;
				break;
				
			case 8:
				count[8]++;
				break;
				
			case 9:
				count[9]++;
				break;
				
			}
		}
			
		for(int i=0;i<=9;i++) {
			System.out.println(count[i]);
		}
		
	}

}
