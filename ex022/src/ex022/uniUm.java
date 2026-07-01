package ex022;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CONTAGEM REGRESSIVA
	Scanner sc = new Scanner(System.in);
	int num=0;
	int x;
	int resultado=0;
	
		System.out.println("DIGITE UM NUMERO PARA REGRESSÁ-LO: ");
		num=sc.nextInt();
		
			for(x=0;x<num;x++) {
				resultado=num-x;
				System.out.println(resultado);
			}
	
	}

}
