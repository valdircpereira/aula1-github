//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
import java.util.Locale;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.printf("NEGATIVO");				
		}
		else {
			System.out.printf("NAO NEGATIVO");
			
		}
		
		
		sc.close();
	}

}
