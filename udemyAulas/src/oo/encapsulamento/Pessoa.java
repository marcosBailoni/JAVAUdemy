package oo.encapsulamento;

public class Pessoa {
	
	private String nome; 
	private int idade;
	
	Pessoa(String nome, int idade){
		setNome(nome); // usando o método de setNome para inserir o nome no novo objeto. 
//		this.nome = nome; 
		setIdade(idade); // usando o método de setter idade na criação do objeto, para ter a mesma validação;
		//this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade < 120) {
			idade = novaIdade;
		}
	}
	
	public String toString() {
		return "Olá, anotamos que seu nome é: " + getNome() + ", e sua idade é de: " + getIdade() + " anos.";
	}
}
