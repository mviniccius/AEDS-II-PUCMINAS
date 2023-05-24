class Bubblesort{
	void sort(int[] array, int n) {
		for (int i = (n - 1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j]. > array[j + 1]) {
	               			
					int temp = array[j];
	      				array[j] = array[j+1];
	      				array[j+1] = temp;
				}
			}
		}
	}
}

class Jogador{
	
	private int id, altura, peso, anoNascimento;
	private String nome, universidade, cidadeNascimento, estadoNascimento;
	
	
	
	public Jogador(int id, String nome, int altura, int peso, String universidade, int anoNascimento, String cidadeNascimento, String estadoNascimento) {
	
		this.setId(id);
		this.setNome(nome);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setUniversidade(universidade);
		this.setAnoNascimento(anoNascimento);
		this.setCidadeNascimento(cidadeNascimento);
		this.setEstadoNascimento(estadoNascimento);
		
	}
	
	public Jogador() {}
	
	public void imprimir(){
        System.out.print("[" + this.id + " ## ");
        System.out.print(this.nome + " ## ");
        System.out.print(this.altura + " ## ");
        System.out.print(this.peso +" ## ");
        System.out.print(this.anoNascimento + " ## ");
        System.out.print(this.universidade +" ## ");
        System.out.print(this.cidadeNascimento +" ## ");
        System.out.print(this.estadoNascimento + "]");
        System.out.println();
    }
	
	public void lerJogador(String entrada){
       
		String [] elemento = entrada.split(",", 8);
        this.id = Integer.parseInt(elemento[0]);
        this.nome = elemento[1];
        this.altura = Integer.parseInt(elemento[2]);
        this.peso = Integer.parseInt(elemento[3]);
        this.universidade = elemento[4];
        
        if (elemento[4].equals(",") || elemento[4].equals("")){
    			this.universidade = "nao informado";
    	}
        
        this.anoNascimento = Integer.parseInt(elemento[5]);
        this.cidadeNascimento = elemento[6];
        if (elemento[6].equals(",") || elemento[6].equals("")){
    			this.cidadeNascimento = "nao informado";
    	}
        
        
        this.estadoNascimento = elemento[7];
        if (elemento[7].equals(",") || elemento[6].equals("")){
        			this.estadoNascimento = "nao informado";
        	}
    }

	
	public Jogador clone(){
        Jogador jogador2 = new Jogador();
        return jogador2;
    }

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidadeNascimento() {
		return cidadeNascimento;
	}
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	public String getEstadoNascimento() {
		return estadoNascimento;
	}
	public void setEstadoNascimento(String estadoNascimento) {
		this.estadoNascimento = estadoNascimento;
	}
	public String getUniversidade() {
		return universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	

	
}

public class Main {

	public static void main(String[] args) throws Exception {
		
		MyIO.setCharset("UTF-8");

		int contador = 0;		
		int linha;
		int qtdeJogadores;
		int i;
		double mediaAltura;
//		double mediaAlturaFilaJogador;
		
		Jogador[] pessoa = new Jogador[4000]; //meu vetor de jogadores
		String str;
		String diretorio;
		String id;
		
	//	diretorio = "/tmp/jogadores.txt";
		diretorio = "jogadores.txt";
		
		ArquivoTextoLeitura leitura = new ArquivoTextoLeitura(diretorio);
		
		str = leitura.ler();
		str = leitura.ler();
		// populando o vetor de Jogadores atraves do arquivo
		
			while(str != null) {		
				
				Jogador jogador = new Jogador();
			
				jogador.lerJogador(str);				
				
				pessoa[contador++] = jogador;
				str = leitura.ler();
			}
			
			leitura.fecharArquivo();
	//aqui deve ser inserido o codigo que ira popular o vetor do tipo jogador:
		
			
//			id = MyIO.readLine();
//			contador = 0;
//			while(!id.equals("FIM")) {
//				linha = Integer.parseInt(id);						
//							
//				//pessoa[linha].imprimir();
//				id = MyIO.readLine();				
//			}		
			
			pessoa.imprimir;
	}

}