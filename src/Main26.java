import java.util.Locale;
import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int totalDias = sc.nextInt();	
		
		int anos = totalDias / 365;
		totalDias = totalDias % 365;
		
		int meses = totalDias / 30;
		totalDias = totalDias % 30;
		
		int dias = totalDias;
		
		System.out.printf("%d ano(s)%n", anos);
		System.out.printf("%d mes(s)%n", meses);
		System.out.printf("%d dias(s)%n", dias);
		 							
		sc.close();
	}
}
		
	

