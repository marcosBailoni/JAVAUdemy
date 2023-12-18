package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Quantos alunos serão informados: ");
		int qtAlunos = entrada.nextInt();

		System.out.printf("Quantas notas serão informadas para cada aluno: ");
		int qtNotas = entrada.nextInt();

		double notasDaTurma[][] = new double[qtAlunos][qtNotas];

		double total = 0;
		for (int aluno = 0; aluno < qtAlunos; aluno++) {

			for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				System.out.printf("Digite a nota %d do aluno %d: ", nota + 1, aluno + 1);
				notasDaTurma[aluno][nota] = entrada.nextDouble();
				total += notasDaTurma[aluno][nota];
			}

		}

		double media = total / (qtAlunos * qtNotas);

		for (int i = 0; i < qtAlunos; i++) {

			for (int j = 0; j < qtNotas; j++) {
				System.out.println();
				System.out.printf("Notas do aluno: %d: %.2f ", i + 1, notasDaTurma[i][j]);
			}

			System.out.println();
		}

		System.out.println();

		// foreach
		for (double[] notasAluno : notasDaTurma) {
			System.out.println("pelo for each" + Arrays.toString(notasAluno));
		}

		System.out.println();
		System.out.printf("A média da turma é %.2f", media);

		entrada.close();
	}

}