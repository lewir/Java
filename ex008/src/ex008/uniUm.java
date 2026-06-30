package ex008;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TEMPO DE VIAGEM.
		
		Scanner sc = new Scanner(System.in);
		
		int vel;
		int dis;
		double tempo;
		
		System.out.println("QUAL A VELCIDADE MEDIA? ");
		vel = sc.nextInt();
		
		System.out.println("QUAL A DISTÃNCIA? ");
		dis = sc.nextInt();
		
		tempo = dis/vel;
		
		System.out.printf("O TEMPO GASTO FOI: %.2f %n", tempo);
		
	}

}
