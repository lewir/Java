package Aplication;
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String para;
		System.out.println(" Digite uma frase: ");
		para=sc.nextLine();
		Frase.maiuscula(para);
		Frase.minuscula(para);
		Frase.contagem(para);
		
		
	}

}
