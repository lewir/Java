package ex005;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CAlCULANDO A ÁREA DE UM CIRCULO.
		
		int r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE O NUMERO DO RAIO: ");
		r = sc.nextInt();
		
		double area= Math.PI*r*r;	
	
		System.out.printf("O VALOR DA ÁREA É: %.3f %n", area);
		/*  r = ENTRADA DIGITADA PELO O USUÁRIO;
		 * 	area = RESULTADO DA ATIBUIÇÃO DO PI, SOBRE O RAIO MULTIPLICADO POR ELE MESMO;
		 *  MAth.PI = VALOR DO PI IMPORTADO NA BBLIOTECA DO JAVA.
		 */
	}

}
