package ex011;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NUMERO, NEGATIVO, ZERO E POSITIVO
		
		Scanner c = new Scanner(System.in);
		
		int n1;
		
		System.out.println("DIGITE UM NÚMERO: ");
		n1=c.nextInt();
		
		if(n1<0) {
			System.out.println("É NEGATIVO");
		}
			else if(n1==0) {
				System.out.println("É ZERO");
			}
			else {
				System.out.println("É POSITIVO");
			}
		

	}

}
