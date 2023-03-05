
import java.util.Random;

public class Procura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random numAleatorio;
		numAleatorio = new Random();
		
		int vetor[][];		
		vetor = new int[3][4];
		
		
		int linhaMaior = 0, colunaMaior = 0;
		int linhaMenor = 9999, colunaMenor = 9999;
		int valorMaior = 0, valorMenor = 9999;
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				//vetor[i][j] = MyIO.readInt();
				vetor[i][j] = numAleatorio.nextInt(100);
			}
		}
		
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(vetor[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		for(int i = 0; i < 3; i++) {			
			for(int j = 0; j < 4; j++) {
				
				
				if(valorMaior < vetor[i][j]) {
					valorMaior = vetor[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
				
				if(valorMenor > vetor[i][j]) {
					valorMenor = vetor[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
				
			}
		}
		
		System.out.println("O maior elemento da matriz eh: " + valorMaior);
		System.out.println("Sua posicao eh: [" + linhaMaior + ", " + colunaMaior + "]");
		
		System.out.println("O menor elemento da matriz eh: " + valorMenor);
		System.out.println("Sua posicao eh: [" + linhaMenor + ", " + colunaMenor + "]");
		
		
		
		
		
		
	}

}
