package stage4;

import java.io.*;
import java.util.StringTokenizer;

public class stage4_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();  //�� ����� �� ���
		StringTokenizer st;
		
		String str;
		
		
		while((str=br.readLine())!=null) {
		
			st= new StringTokenizer(str," ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(A+B).append("\n");  //append �̿��ؼ� �� ���� �� �ִ�
			//System.out.println(A+B);  �� ��Ÿ�� ����
			
		}
		System.out.print(sb);
		
	}
	
}
