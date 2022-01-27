package stage6;

import java.io.*;


public class stage6_2 {

	static boolean[]arr = new boolean[10001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10001;i++) { //10001
			int n = d(i);  //sum1°ª Ãâ·ÂµÊ
			
			if(n<10001)
				arr[n]=true;
			
		}
		
		for(int i=1;i<10001;i++) {
			if(!arr[i])
				System.out.println(i);
		}
		
		
	}

	
	public static int d(int num) {
		int sum1=num;
		
		while(num!=0) {
			
			sum1+=num%10;
			num=num/10;
			
		}
		
		return sum1;
		
	}
	
}

