package prj;

import java.util.Scanner;
public class Quadrado {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int a[]  = new int[10], b[] = new int[10], i=0;
		
		System.out.println("Digite 10 números inteiros: ");
		for (i=0; i<10; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("Esse é o quadrado dos números: ");
		for (i=0; i<10; i++) {
			b[i] = a[i] * a[i];
			System.out.println(" "+b[i]);
		}
		in.close();
	}
}
