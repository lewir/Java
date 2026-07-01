package ex007;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SALÁRIO COM AUMENTO.
		int sal;
		int aum;
		int fin;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("DIGITE O SEU SALÁRIO ATUAL: ");
		sal = sc.nextInt();
			aum = sal * 10 /100;	
				fin = aum+sal;
		System.out.printf("O SEU SALÁRIO FINAL É: %d %n", fin);

		System.out.printf("VOCÉ TEM UM AUMENTO DE: %% %d %n", aum);
		
		
	}

}
