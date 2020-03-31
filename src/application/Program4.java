//Fazer um programa para ler os valores da largura e altura de um ret�ngulo.
// Em seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal. Usar uma classe como mostrado no projeto ao lado.
// Enter rectangle width and height:
//3.00
//4.00
//AREA = 12.00
//PERIMETER = 14.00
//DIAGONAL = 5.00
//Exemplo: Exerc�cio 1
//Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). 
//Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
//sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) 
// e mostrar novamente os dados do funcion�rio. Use a classe projetada abaixo.

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
	}
}