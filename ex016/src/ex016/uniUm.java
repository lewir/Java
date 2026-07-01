package ex016;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VERIFICADOR DE IDADE PARA VOTAÇÃO
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE SUA IDADE: ");
		idade=sc.nextInt();
		if (idade < 16) {
			System.out.printf("SUA IDADE NÃO É O SUFICIENTE: %d %n", idade);
		}
		else if (idade > 16 && idade < 18) {
			System.out.printf("SUA IDADE PERMITE VOTO OPCIONAL: %d %n", idade);
	
		}else {
			System.out.printf("VOTO OBRIGATÓRIO:", idade);
		}
	
	
	}

}
