package hihi;

import java.util.Scanner;

public class stage1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		int B = num.nextInt();
		int C=B;
		int result=0;
		int sum=0;
		
		for(int i=0;i<(int)(Math.log10(A)+1);i++) {
			//System.out.println("C"+i+": "+C);
			result=A*(C%10);
			System.out.println(result);
			C=C/10;
			
			if(i>=1) {
				result=result*((int)Math.pow(10, i));
			}
			//System.out.println("10^i: "+ Math.pow(10, i) );
			//System.out.println("result"+i+": "+result);
			sum+=result;
		}
		
		System.out.println(sum);
	}

}
