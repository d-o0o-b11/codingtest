package stage5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class stage5_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;  //���� �������� �Է°� �ޱ�
		
		int t = Integer.parseInt(br.readLine());  //ù��° �� 5
		
		int[] arr = new int[t];  //�迭 ũ�� ��°� �����ϱ�
		
		
		st= new StringTokenizer(br.readLine()); //�ι�° �� 20 10 35 30 7
		
		for(int i=0;i<t;i++) {
	
			arr[i]= Integer.parseInt(st.nextToken());
			
			
		}
		
		Arrays.sort(arr);  //�迭 ����
		
		
		System.out.println(arr[0]+" "+arr[t-1]);
		
	}

}
