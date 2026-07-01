package ex009;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PAR OU IMPAR
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE O NUMERO: ");
		num = sc.nextInt();
		
		if( num%2 == 0 ) {
			System.out.println("par");
		}
		else{
			System.out.println("Impar");
		}
	}

}
