package ex024;
import java.util.Scanner;
public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LOGIN SENHA//LOG
		Scanner sc = new Scanner(System.in);
		int senha=0;
		int log=0;
		
		do {
		    System.out.println("Digite seu login: ");
		    log = sc.nextInt();
		    System.out.println("Digite sua senha: ");
		    senha = sc.nextInt();
		    if(log ==1234 && senha ==2253) {
		    			System.out.println("BEM-VINDO!");	
		    }

		} while (senha != 1234 || log != 2253); // repete enquanto estiver ERRADO


		}

}
