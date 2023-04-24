class Fila {

	private Jogador[] fila;
	private int frente;
	private int tras;
	private int tamanho;
	
	public Fila(int tamanho) {
		
		fila = new Jogador[tamanho];
		frente = 0;
		tras = 0;
		this.tamanho = tamanho;
	}
	
	public boolean filaVazia() {
	
		boolean resp;
		
		if (frente == tras)
			resp = true;
		else
			resp = false;
		
		return resp;
	}
	
	public boolean filaCheia() {
	
		boolean resp;
		
		if (((tras + 1) % tamanho) == (frente % tamanho))
			resp = true;
		else
			resp = false;
		
		return resp;
	}
	
	public void enfileirar(Jogador novo) throws Exception{
		
		int posicao;
		
		if (! filaCheia()) {
			posicao = tras % tamanho;
			fila[posicao] = novo;
			tras++;
		} else
			throw new Exception("Não foi possível enfileirar o novo elemento: a fila está cheia!");
	}
	
	public Jogador desenfileirar() throws Exception{
		
		Jogador desenfileirado;
		int posicao;
		
		if (! filaVazia()) {
			posicao = frente % tamanho;
			desenfileirado = fila[posicao];
			frente++;
			return desenfileirado;
		} else
			throw new Exception("Não foi possível desenfileirar nenhum elemento: a fila está vazia!");
	}
	
	public void imprimir() throws Exception{
		
		int posicao;
		if (! filaVazia()) {
			System.out.println("Conteúdo da fila:");
			for (int i = frente; i < tras; i++) {
				posicao = i % tamanho;
				System.out.print("Posição: " + posicao + ": ");
				fila[posicao].imprimir();
			}
		} else
			throw new Exception ("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
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
		
		Jogador[] pessoa = new Jogador[4000];
		String str;
		String diretorio;
		int contador = 0;		
		String id;
		int linha;
		Fila filaJogador;
		
		filaJogador = new Fila(6);
	//	diretorio = "/tmp/jogadores.txt";
		diretorio = "jogadores.txt";
		
		ArquivoTextoLeitura leitura = new ArquivoTextoLeitura(diretorio);
		
		str = leitura.ler();
		str = leitura.ler();
		// populando o vetor de Jogadores
		
			while(str != null) {		
				
				Jogador jogador = new Jogador();
			
				jogador.lerJogador(str);				
				
				pessoa[contador++] = jogador;
				str = leitura.ler();
			}
			
			leitura.fecharArquivo();
	//aqui deve ser inserido o codigo que vai enfileirar	
		
			id = MyIO.readLine();
			
			while(!id.equals("FIM")) {
				linha = Integer.parseInt(id);
				pessoa[linha].imprimir();
				filaJogador.enfileirar(pessoa[linha]);				
				id = MyIO.readLine();				
			}		
	//aqui escrever o codigo para realizar a segunda parte da questao 	 
			
	}

}