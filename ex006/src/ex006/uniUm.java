package ex006;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CONVERSÃO DA MOEDA REAL PARA DOLAR.
		
		double real;
		double dol = 5.22;
		double quan;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE QUANTOS REAIS VOCẼ TEM: ");
		real = sc.nextDouble();
		
		quan = real*dol;
		
		System.out.printf("V0CẼ TEM %.2f dolares %n", quan);		
	}

}
