package br.senior.proway.arrays;

import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {

		double[] notas = { 9.0, 8.7, 7.2, 8.2 };

		for (int i = 0; i < notas.length; i++) {

			System.out.println((notas[i]));
		}

		for (double nota : notas) {
			System.out.printf(nota + " ");

		}

	}

}
