//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Locale;
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		if (N % 2 ==0) {
			System.out.printf("PAR");				
		}
		else {
			System.out.printf("IMPAR");
			
		}
		
		sc.close();
	}
}
