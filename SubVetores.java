package prj;

import java.util.Scanner;
public class SubVetores {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[]  = new int[10], b[] = new int[10],c[] = new int[10], i=0;

		
		for (i=0; i<10; i++) {
			System.out.println("Digite 2 n�meros inteiros para as vari�veis 'a' e 'b': ");
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		
		System.out.println("Esse � o processo de subtra��o e seus resultados: ");
		for (i=0; i<10; i++) {
			
			c[i] = a[i] - b[i];
			System.out.println(a[i]+" - "+b[i]+" = "+c[i]);
		}
	in.close();
	}
}