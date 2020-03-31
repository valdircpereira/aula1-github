//Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
//que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
//para ser respons�vel pelos c�lculos.

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();



	}

}
