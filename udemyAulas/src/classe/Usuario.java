package classe;

public class Usuario {

	String nome;
	String email;

//	Parametrizando o Equals: 

	public boolean equals(Object objeto) {

//		No caso abaixo, transformamos o parâmetro passado no equals para o tipo Usuario, para podermos comparar com o outro objeto Usuario escolhido;
		Usuario novo = (Usuario) objeto;

//		O equals retornará verdadeiro ou falso, com isso, comparamos o email e nome do objeto escolhido com o objeto passado como parâmetro;
		return novo.nome == this.nome && novo.email == this.email;

	}

}
