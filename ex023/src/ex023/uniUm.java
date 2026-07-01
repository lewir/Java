package ex023;
import java.util.Scanner;

public class uniUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MÉDIA DA TURMA;
		Scanner sc = new Scanner(System.in);
		
		int medAluno = 0;
		int mediaTurma = 0;
		int x;
		
		for(x=0;x<5;x++) {
			System.out.printf("DIGITE A NODA DO ALUNO: %d %n", x);
			medAluno=sc.nextInt();
			
			mediaTurma+=medAluno;
		}
		mediaTurma = mediaTurma/5;
		System.out.println(mediaTurma);
	}

}
