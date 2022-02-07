package stage7;

import java.io.*;

public class stage7_3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		int st[]=new int[26];
		
		for(int i=0;i<st.length;i++) {
			st[i]=-1;
		}
		
		for(int i=0;i<num.length();i++) {
			char ch=num.charAt(i);
			
			if(st[ch-'a']==-1)
				st[ch-'a']=i;
		}
		
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+ " ");
		}
	}

}
