package prj;

import java.util.Scanner;
public class NumeroTabuada {
	public static void main(String[] args) {
	        
	        Scanner in = new Scanner(System.in);
	        int n, rt;

	        System.out.println("Digite um número inteiro: ");
		        n = in.nextInt();
	        
	        for (int i= 1;i<=10; i++) {
	        	
		        rt = n * i;
		        System.out.println(rt);
	               
	            }
	        in.close();
	    }
	}