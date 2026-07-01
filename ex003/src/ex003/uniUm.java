package ex003;
import java.util.Scanner;
public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PROGRAMA DE MÉDIA
		
		
		int n1, n2, n3, n4;
		int res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE A NOTA");
		n1 = sc.nextInt();
		
		System.out.println("DIGITE A NOTA");
		n2 = sc.nextInt();

		System.out.println("DIGITE A NOTA");
		n3 = sc.nextInt();
		
		System.out.println("DIGITE A NOTA");
		n4 = sc.nextInt();
		
		res = n1 + n2 + n3 + n4 / 4;
		
		System.out.printf("A MÉDIA É: %d %n ", res);
		
		
	}

}
