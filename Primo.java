package prj;

import java.util.Scanner;
public class Primo {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int CO= 10;
		int a[]  = new int[10], NP=0, dvn, o, i=0;
		
		System.out.println("Digite n�meros para saber se s�o primos ou n�o: ");
		for (i=0; i<CO; i++) {
			a[i] = in.nextInt();	
		}
		
		for (i=0; i<CO; i++) {
			dvn = 0;
			o = i;		
			for (i=1; i<=a[o]; i++) {
				if (a[o] % i == 0) {
					dvn = dvn + 1;
				}
			}
			if (dvn == 2) {
				NP = NP + 1;
				System.out.println(a[o]+ " � um n�mero primo.");
			} else {
				System.out.println(a[o]);
		}
			System.out.println(NP+" � a quantidade total de n�meros primos.");
		in.close();
}
}
}
