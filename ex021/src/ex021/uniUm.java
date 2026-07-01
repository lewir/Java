package ex021;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TABUDA
		Scanner sc = new Scanner(System.in);
		int num=0;
		int x=0;
		int soma=0;
			
		System.out.println("DIGITE UM NUMERO QUE VOCÊ DESEJA A TABUADA: ");
		num=sc.nextInt();
		
		for(x=0;x<10;x++) {
			soma=num*x;
			System.out.println(soma);
			
		}
	}

}
