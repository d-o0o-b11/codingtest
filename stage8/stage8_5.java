package stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stage8_5 {
		
	public static void main(String[] args)throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) { //2
			int floor=101; //����
			int count=0; //����� ����
			int ho=0;
			
			st= new StringTokenizer(br.readLine());
			
			int H= Integer.parseInt(st.nextToken()); //ȣ�� �� ��
			int W= Integer.parseInt(st.nextToken()); //������ �� ��
			int N= Integer.parseInt(st.nextToken()); //���° �մ�
			
			//System.out.println(H+","+W+","+N);
			for(int k=0;k<W;k++) {
				ho++;
				for(int j=0;j<H;j++) {
					
					floor = (j+1) * 100 + ho;
					
					count++;
					//System.out.println("j:"+j+" i:"+i+" floor:"+ floor);
					if(count==N) {
						System.out.println(floor);
						break;
						
					}
					
					
				}
			}
			
			
		}
		
		
		
	}

}
