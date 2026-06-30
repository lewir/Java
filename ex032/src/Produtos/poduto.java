package Produtos;

public class poduto {
	
	String nome;
	double preco;
	int quantidade;
	
	double calcularvalor() {
		double valor;
		valor = preco*quantidade;
		
		return (valor);
	}
	

}
