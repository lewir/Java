package ex025;
import java.util.Scanner;
public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SOMAR ATÉ DIGITAR ZERO (0)
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int soma=0;
		
		do {
			System.out.println("DIDITE UM NUMERO: ");
			num1=sc.nextInt();
			soma+=num1;
		}while(num1!=0);
		
		System.out.printf("A SOAM É: %d %n", soma);
			
	}

}
