
public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double mediaAprovados;
		int notaAluno;
		int numAlunos = 10;
		int respostas = 8;
		int i, j;

		int mediaVetor[];
		mediaVetor = new int[10];
		
		
		int numMatricula[];
		numMatricula = new int[numAlunos];
		for(i = 0; i < numAlunos; i++) {
			numMatricula[i] = i+1;
		}
		
		int gabaritoProva[];
		gabaritoProva = new int[8];
		System.out.println("Digite o gabarito da prova: ");
		for(i = 0; i < gabaritoProva.length; i++) {  // popular o gabarito
		 gabaritoProva[i] = MyIO.readInt();
		}
		
		int correcao[][];
		correcao = new int[numAlunos][respostas];		
		
		for(i = 0; i < numAlunos; i++) {	
			
			System.out.println("Digite as respostas do aluno de matricula: " + numMatricula[i]);
			notaAluno = 0;						
			for(j = 0; j < respostas; j++) {				
										    					
				correcao[i][j] = MyIO.readInt();	
				
				if(correcao[i][j] == gabaritoProva[j]) {					
					notaAluno +=1;
					}
				}				
			
			mediaVetor[i] = notaAluno;			
			
		}
			
			System.out.print("\n");			
		
		
		for(i = 0; i < numAlunos; i++) {
			System.out.println("Matricula: " + numMatricula[i] + " Total: "+mediaVetor[i]);   //imprimir os resultados e nota
			System.out.println("Respostas: ");
			for(j = 0; j < respostas; j++) {
				System.out.println(correcao[i][j]);
			}
		}
		
		for(i = 0; i < numAlunos; i++) {
			System.out.println("Matricula: " + numMatricula[i] + " Total: "+mediaVetor[i]);   //imprimir os resultados e nota
		}
			
			
			
		mediaAprovados = 0;
		for(i = 0; i < numAlunos; i++) {	
			if(mediaVetor[i] >= 5) {		//calcular a media de aprovados		
				mediaAprovados +=1;				
			}			
		}
		mediaAprovados = (mediaAprovados/numAlunos) * 100.00;
		System.out.println("Media de aprovados na turma: " + mediaAprovados+"%");		
		
	}

}