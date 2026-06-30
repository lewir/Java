package ex020;
import java.util.Scanner; 

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SOMA DE 5 NUMEROS
		
		int num=0;
		int soma=0;
		int x=0;
		Scanner sc = new Scanner(System.in);
		
		for(x=0;x<5;x++) {
			System.out.println("DIGITE UM NUMERO: ");
			num=sc.nextInt();
			soma+=num;
		}

		System.out.println(soma);
}
}