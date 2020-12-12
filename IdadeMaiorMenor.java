package prj;

import java.util.Scanner;
public class IdadeMaiorMenor {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int iu, an, aa, imv, imn;
		
		System.out.print("Digite o ano atual: ");
        aa = in.nextInt();
        
        System.out.print("Digite o ano em que você nasceu: ");
        an = in.nextInt();
        
        iu = aa - an;
        
        imv = iu;
        imn = iu;
        
        System.out.println("Essa é sua idade atualmente: "+iu);
        
        for (int i= 1;i<=9; i++) {
        	System.out.print("Digite o ano em que você nasceu: ");
			an = in.nextInt();
			
			iu = aa - an;
			
			System.out.println("Esta é a sua idade: " +iu);
			
        	
			if (iu > imv) {
				imv = iu;
				}
			if (iu < imn) {
				imn = iu;
				}
			System.out.println("Essa é a maior idade: "+imv);
			System.out.println("Essa é a menor idade: "+imn);
        }
        in.close();
	}
}