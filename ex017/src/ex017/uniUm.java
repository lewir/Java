package ex017;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LOGGIN
		Scanner sc = new Scanner(System.in);
		int adm;
		int sen;
		
		System.out.println("DIGITE O LOGIN");
		adm=sc.nextInt();
		System.out.println("DIGITE A SENHA");
		sen=sc.nextInt();
	if(adm==2253 && sen==4455) {
		System.out.println("VOCẼ ESTÁ LOGADO! ");
	}
	else {
		System.out.println("SENHA INCORRETA, CRIE UM NOVO USUÁRIO!");
	}
	
	}

}
