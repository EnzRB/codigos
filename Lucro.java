package prj;

import java.util.Scanner;
public class Lucro {
	public static void main(String[] args) {
	        
			Scanner in = new Scanner(System.in);
	        double vcp, vvp, vl;
	        String ru;

	        do {
	            
	        	System.out.println("Digite o pre�o de custo do produto:");
	            vcp = in.nextDouble();

	            System.out.println("Digite o pre�o de venda do produto:");
	            vvp = in.nextDouble();

	            vl = vvp - vcp;

	            System.out.println(vl);

	            System.out.println("Deseja continuar a execu��o? (Sim/N�o)");
	            ru = in.next();

	            if (ru.equalsIgnoreCase("N�o")){
	                break;
	                }

	            } while (ru.equalsIgnoreCase("Sim")); 
	            in.close();
	        }
	    }