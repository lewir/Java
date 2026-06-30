package Produtos;
import java.util.Scanner;
public class uiUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Valor do Produto
		Scanner sc = new Scanner(System.in);
		poduto prod = new poduto();
		
		System.out.println("TABELA DE PREÇOS: ");
		
		System.out.println("Digite o Nome:"); 
		prod.nome=sc.nextLine();
		
		System.out.println("Digite o Preço");
		prod.preco=sc.nextDouble();
		
		System.out.println("Digite a Quantidade: ");
		prod.quantidade=sc.nextInt();
		
		System.out.println("O Valor É: ");
		
		System.out.println(prod.calcularvalor());
		
		
	}

}
