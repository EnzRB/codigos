package prj;

import java.util.Scanner;
public class Multiplo {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
	       
		for (int I= 1;I<=100; I++) {
			if (I % 10 == 0) {
				System.out.println(+I+ " Este n�mero � m�ltiplo de 10");
			
		}else {
				System.out.println(I);
	       
	        in.close();
			}
		}
	}
}