package ex002;
import java.util.Scanner;

public class UniUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int res;
		//LENDO, E ATIBUINDO CALCUL

		Scanner sc = new Scanner (System.in);
		
		System.out.println("OLÁ, DIGITE UM NÚMERO");
		x = sc.nextInt();
		
		System.out.println("DIGITE OUTRO NUMERO:");
		y = sc.nextInt();
		
		System.out.printf("OS NUMERO DIGITADOS FORAM: %d, %d %n", x , y);
		res = y + x;
		
		System.out.printf("LOGO O RESULTADO DA SOMA É: %d %n", res);
		
	}

}
