package br.senior.proway.arrays;


public class Exercicio {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.printf(notasAlunoA[i] + " ");

		}
		for (double nota : notasAlunoA) {
			System.out.printf(nota + " ");

		}
	}
}