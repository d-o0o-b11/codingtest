package stage2;

import java.util.Scanner;

public class stage2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int A = num.nextInt();
		int B = num.nextInt();
		
		int result=0;
		
		result = A-B;
		
		if(result<0)
			System.out.println("<");
		else if(result>0)
			System.out.println(">");
		else
			System.out.println("==");
		
	}

}
