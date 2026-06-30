package Aplication;

public class Frase {
	

	static void maiuscula(String frase1) {
		String completa1;
		completa1=frase1.toUpperCase();
	System.out.println(completa1);
		
	}
	static void minuscula(String frase2)
	{
		String completa2;
		completa2=frase2.toLowerCase();
		System.out.println(completa2);
		
	}
	static void contagem(String frase3) {
		int completa3;
		
		completa3 = frase3.length();
		
		System.out.printf("A frase tem: " + completa3 + " caracteres");
		
	}
}
