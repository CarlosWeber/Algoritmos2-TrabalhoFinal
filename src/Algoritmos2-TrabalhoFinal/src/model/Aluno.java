package model;

public class Aluno {
	private String nome;
	private String email;
	private int idade;
	private String cidade;
	
	public Aluno (String nome, String email, int idade, String cidade) {
		this.nome= nome;
		this.email=email;
		this.idade=idade;
		this.cidade=cidade;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + ", idade=" + idade + ", cidade=" + cidade + "]";
	}
	
	
	
}
