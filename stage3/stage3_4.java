package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class stage3_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;  //공백으로 숫자를 분류하기 위해선 필수코드!!
		
		int t = Integer.parseInt(num.readLine());
		
		for(int i=0;i<t;i++) {
			st= new StringTokenizer(num.readLine()); //!!!
			//System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));  //!!!
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
		}
	
		bw.close();
		
	}

}
