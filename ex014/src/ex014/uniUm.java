package ex014;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CALCULADORA SIMPLES
		Scanner sc = new Scanner(System.in);
		int op;
		int n1, n2, n3;
		System.out.println("==========CALCULADORA SIMPLES===============");
		System.out.println("1. SOMA");
		System.out.println("2. SUBTRAÇÃO");
		System.out.println("3. MULTIPLICAÇÃO");
		System.out.println("4. DIVISÃO");
		System.out.println("DIGITE UMA OPÇÃO VÁLIDA: ");
		op =sc.nextInt();
		
		switch (op) {
			case 1:
				System.out.println("DIGITE UM NUMERO: ");
				n1=sc.nextInt();
				System.out.println("DIGITE OUTRO: ");
				n2=sc.nextInt();
				n3=n1+n2;
				System.out.printf("O RESULTADO DA SOMA É:%d ",n3);
			break;
			case 2:
				System.out.println("DIGITE UM NUMERO: ");
				n1=sc.nextInt();
				System.out.println("DIGITE OUTRO: ");
				n2=sc.nextInt();
				n3=n1-n2;
				System.out.printf("O RESULTADO DA SUBTRAÇÃO É:%d ",n3);
			break;
			case 3:
				System.out.println("DIGITE UM NUMERO: ");
				n1=sc.nextInt();
				System.out.println("DIGITE OUTRO: ");
				n2=sc.nextInt();
				n3=n1*n2;
				System.out.printf("O RESULTADO DA MULTIPLICAÇÃO É:%d ",n3);
			break;
			case 4:
				System.out.println("DIGITE UM NUMERO: ");
				n1=sc.nextInt();
				System.out.println("DIGITE OUTRO: ");
				n2=sc.nextInt();
				n3=n1/n2;
				System.out.printf("O RESULTADO DA DIVISÃO É:%d ",n3);
			break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
			break;
		}
	}

}
