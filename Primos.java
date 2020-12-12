package prj;

public class Primos {
	public static void main(String[] args) {
        
		int n, i, dvn=1;

        for (n=1;n<=200;n++) {
        	dvn = 0;
            for (i=1;i<=n;i++) {
                if (n % i == 0) {
                	dvn = dvn + 1;
                }
            }
            if (dvn == 2) {
                System.out.println(n+ " O número cujo se encontra nesse local é primo");
            }else {
                System.out.println(n);
         }
      }
    }
}