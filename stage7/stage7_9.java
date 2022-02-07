package stage7;

import java.io.*;
import java.util.StringTokenizer;

public class stage7_9 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		int count=0;
		for(int i=0;i<num.length();i++) {
			
			count++;
			
			switch(num.charAt(i)) {
			case 'c':
					if((i<num.length()-1) && (num.charAt(i+1)=='=' || num.charAt(i+1)=='-'))
						i++;
				break;
			
			case 'd':
				
				if((i<num.length()-2) && num.charAt(i+1)=='z' && num.charAt(i+2)=='=')
						 i+=2;
				else if(i<num.length()-1 &&(num.charAt(i+1)=='-')) 
					 	i++;
					
				
				break;
			
			case 'l':
					if((i<num.length()-1) && num.charAt(i+1)=='j')
						i++;
				break;
			
			case 'n':
					if((i<num.length()-1) && num.charAt(i+1)=='j')
						i++;
				break;
				
			case 's':
					if((i<num.length()-1) && num.charAt(i+1)=='=')
						i++;
				break;
				
			case 'z':
					if((i<num.length()-1) && num.charAt(i+1)=='=')
						i++;	
				
				break;
			
			
			
			}
		}
		
		System.out.println(count);
		
	}

}
