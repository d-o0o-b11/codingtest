package stage2;

import java.util.Scanner;

public class stage2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int h = num.nextInt();
		int m = num.nextInt();
		
		int result=0;
		
		if(m-45<0) {
			if(h-1<0)
				h=23;
			else
				h-=1;
			
			result=45-m;
			m=60-result;
		}
		else if(m-45>=0){
			
			m-=45;
		}
		
		System.out.println(h+" "+m);
		
	}

}
