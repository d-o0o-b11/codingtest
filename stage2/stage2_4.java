package stage2;

import java.util.Scanner;

public class stage2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();
		int y = num.nextInt();
		
		if(x>0 && y>0)
			System.out.println("1");
		else if(x<0 && y>0)
			System.out.println("2");
		else if(x<0 && y<0)
			System.out.println("3");
		else if(x>0 && y<0)
			System.out.println("4");
		
	}

}
