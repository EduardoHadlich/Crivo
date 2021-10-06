package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static ArrayList<Integer> calcularCrivo(int n) {
    	
        boolean[] primosBoolean = new boolean[n + 1];
        int raiz = (int) Math.floor(Math.sqrt(n));
        ArrayList<Integer> primos = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            primosBoolean[i] = true;
        }
    				
        for (int i = 2; i <= raiz; i++) {
            if (primosBoolean[i]) {
                for (int j = i; i * j <= n; j++) {
                    primosBoolean[i * j] = false;
                }
            }
        }
        
        
        for(int i=2; i <= n; i++) {
            if(primosBoolean[i]) {
                primos.add(i);
            }
        }
        return primos;
    }
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	    System.out.print("Digite um numero: ");
	    int n = leitor.nextInt();
	    leitor.close();
        
	    ArrayList<Integer> primos = new ArrayList<>();
	    primos = calcularCrivo(n);
	    primos.forEach(System.out::println);
	    
	}
}
