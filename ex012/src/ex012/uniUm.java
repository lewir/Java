package ex012;
import java.util.Scanner;
public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MEDIDOR DE MEDIA E SITUAÇÃO
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		int med;
		
		System.out.println();
		n1=sc.nextInt();
		System.out.println();
		n2=sc.nextInt();
			med=n1+n2/2;
			
			if(med >7) {
				System.out.println("APROVADO! ");
			}
			else if(med>5 && med<6.9) {
				System.out.println("RECUPERAÇÃO! ");
			}
			else {
				System.out.println("REPROVADO! ");
			}
	
	}

}
