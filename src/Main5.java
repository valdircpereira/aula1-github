//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
//decimais.

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
	
		double salario = valorHora * horas;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = R$ %.2f%n", salario);
		
		sc.close();

	}

}
