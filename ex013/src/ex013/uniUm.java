package ex013;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MEDIDOR DE NUMEROS
	Scanner sc = new Scanner(System.in);
	
	int n1,n2,n3;
	
	System.out.println("DIGITE NUMERO 1");
	n1=sc.nextInt();
	System.out.println("DIGITE NUMERO 2");
	n2=sc.nextInt();
	System.out.println("DIGITE NUMERO 3");
	n3=sc.nextInt();
	
		if (n1 > n2 && n1 > n3) {
			System.out.printf("O NUMERO 1 É MAIOR: %d %n", n1);
		}
		else if (n2 > n1 && n2 > n3)	{
			System.out.printf("O NUMERO 2 É MAIOR; %d %n", n2);	

		}
		else {
			System.out.printf("O NUMERO 3 É MAIOR: %d %n", n3);
		}
		}

}
