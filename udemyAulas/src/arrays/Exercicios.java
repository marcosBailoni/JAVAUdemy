package arrays;

import java.util.Arrays;

public class Exercicios {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
	
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
	
		String notasAlunoAEmString = Arrays.toString(notasAlunoA); // transforma o conteúdo do array em string
		System.out.println(notasAlunoAEmString); //print da string criada a partir do array.
		
		System.out.println(notasAlunoA); // mostra o endereço do objeto;
		System.out.println(notasAlunoA[0]); // print do valor especificado pelo indice
		
		double total = 0;
		//usando for pra percorrer todos indices e printar cada um;
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(notasAlunoA[i]);
			total += notasAlunoA[i];
		}
		
		double media = total / notasAlunoA.length;
		System.out.printf("A média do aluno é: %.2f",  media);
		
		System.out.println("\n"); // pular uma linha
	
		double[] notasAlunoB = {5.0, 2.5, 3, media}; // array recebe variaveis como dado também;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.println("Notas aluno B: " + notasAlunoB[i]);
		}
		
	
	}

}
