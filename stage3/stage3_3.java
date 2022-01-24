package stage3;

import java.util.Scanner;

public class stage3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		int t = num.nextInt();
		int sum=0;
		
		for(int i=1;i<=t;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
