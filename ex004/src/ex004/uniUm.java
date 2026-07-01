package ex004;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CONVERSÃO DE CELSUS PARA FAH;
		
		double c, f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" DIGITE A TEMPERATURA EM CELSIUS");
		c = sc.nextDouble();
		
		f = (c * 9/5) + 32;
		
		System.out.printf("O VALOR EM FAHRENHEIT É : %.1f %n", f);
		/*  SOBRE A FÓRMULA, {  f = ( c* 9/5) + 32  }
		 *  c =  TEMPRETURA EM CELSIUS;
		 *  f = TEMPERATURA EM FAHRENHEIT;
		 *  ( c * 9/5) = CELSIUS TEM UMA PRECEDẼNCIA, UMA MULTIPLICAÇÃO SOBRE UMA DIVISÃO (CONSTANTE);
		 *  + 32 = UMA SOMA CONTANTE QUE IMPACTA NO FINAL DA ATRIBUIÇÃO.
		 *  */	
	
	}

}
