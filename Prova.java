package prj;

import java.util.Scanner;
public class Prova {

	 public static void main(String[] args){
	       int TAM=10;
	       int i=1, ii;
		double acm=0, ma=0;
		Scanner in = new Scanner(System.in);
		
		do{
		        System.out.println("Entre com o valor:");
			ii = in.nextInt();
			acm +=ii;
			i++;
		}while(i<=TAM);
		ma = acm / TAM;
		System.out.println("O resultado é: "+ma);
		
	 }
	}
