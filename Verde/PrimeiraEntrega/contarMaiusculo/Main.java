
public class Main {

	public static int contar(String str) {
		int count = 0;
		int i;
		
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 			// coferir se o caracter no indice eh maiusculo
				count++; 												//adicionar 1 ao contador quando for verdadeiro
		}		
			
	return count; 														// retornar a quantidade de characteres maiusuculos encotrados
	}
	
	
	public static void main(String[] args) {
		
		String str;
		
		str = MyIO.readLine(); 											// primeira palavra antes do loop 
				
		while(!str.equals ("Fim")) { 									// verifica de a condicao eh verdadeira
			
			System.out.println(contar(str));  							// chama o metodo e imprime a quantidade de caracteres encontrados
			str = MyIO.readLine(); 										// digita a proxima palavra para ficar preso dentro do looping
			
		}

	}

}
