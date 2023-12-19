package colecoes;

;

public class Usuario {

	String nome;
	
	Usuario(String nome) {
		this.nome = nome;
	}
//	Sempre que tentar imprimir um Usuario, por padrão, será chamado o método toString, que irá imprimir a descrição/endereço de memória
//	Ao parametrizar, para que o toString retorne um print + o nome do Usuario, ele trará o nome do usuário diretamente
	
	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
	
	
}
