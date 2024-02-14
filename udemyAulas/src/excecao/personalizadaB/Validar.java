package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

	private Validar() {}
	
//	Aqui é necessário informar que o metodo "lança" as Excpetions, já que as exceptions utilizadas "extends" de exception, que é checada!!
	public static void aluno(Aluno aluno) throws IllegalArgumentException, StringVaziaException, NumeroForaIntervaloException {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
