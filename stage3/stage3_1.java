package stage3;

import java.util.Scanner;

public class stage3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(A+" * "+i+" = "+(A*i));
		}
		
	}

}
