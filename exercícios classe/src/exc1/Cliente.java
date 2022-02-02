package exc1;

public class Cliente {
	
	private String nome, rua, produto;
	private int idade, cpf;
	
		
	
	public Cliente(String nome, String rua, String produto, int idade, int cpf) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.produto = produto;
		this.idade = idade;
		this.cpf = cpf;
		
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", rua=" + rua + ", produto=" + produto + ", idade=" + idade + ", cpf=" + cpf
				+ "]";
	}







	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void comprar(String produto) {
		this.produto=produto;
		System.out.println(produto+" comprado");
		
		
		
		
		
		
			}
	
	
	
	
	
	
	
}
