//Faça um programa para ler o valor do raio de um circulo, e depois mostrar o valor da area deste 
//circulo com quatro casas decimais conforme exemplos.
//Formula da area: area = pi . raio2    Considere o valor de pi = 3.14159

import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
				
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double R, A, pi = 3.14159;			
		    
		    R = sc.nextDouble();

		    A = pi * R * R;

		    System.out.printf("A=%.4f%n", A);

			sc.close();

	}

}
