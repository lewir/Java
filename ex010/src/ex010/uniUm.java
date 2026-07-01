package ex010;
import java.util.Scanner;


public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MAIOR DE DOIS NUMEROS
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("QUAL NÚMERO É MAIOR: ");
		System.out.println("DIGITE UM NUMERO: ");
		n1 = sc.nextInt();
		System.out.println("DIGITE OUTRO NUMERO: ");
		n2 = sc.nextInt();
		
		if(n1>n2){
			System.out.printf("O NUMERO %d, É MAIOR QUE O %d %n", n1, n2);
		}
		else {
			System.out.printf("O NUMERO %d, É MAIOR QUE O %d %n", n2, n1);			
		}
	}

}
