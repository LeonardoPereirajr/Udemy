package br.senior.proway.arrays;

import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);//inicializa metodo Scanner
		
		System.out.println(" Quantas notas ? : ");//pergunta ao usuario
		int qtdnotas = entrada.nextInt();//salva a informação que o usuario inseriu

		double[] notas = new double[qtdnotas]; //array inicializada

		for (int i = 0; i < notas.length; i++) {
			System.out.print(" Nota  " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
		}//for para informação das notas
		
		double total = 0;//variavel inicializada de notas
		
		for (double nota : notas) {
			total += nota;
		}//foreach para soma de notas
		
		double media = total / notas.length;
		System.out.printf(" A media é %.2f !", media);
		entrada.close();
	}

}
