//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codPeca1 = sc.nextInt();
		int numePeca1 = sc.nextInt();
		double valorUnitPeca1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int numePeca2 = sc.nextInt();
		double valorUnitPeca2 = sc.nextDouble();
	
		double valorTotalPeca1 = numePeca1 * valorUnitPeca1;
		double valorTotalPeca2 = numePeca2 * valorUnitPeca2;
		
		double total = valorTotalPeca1 + valorTotalPeca2;
					
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
		
		sc.close();
		
		
		
		
		sc.close();

	}

}
