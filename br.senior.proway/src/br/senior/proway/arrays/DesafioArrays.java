package br.senior.proway.arrays;

import java.util.Scanner;

public class DesafioArrays {
	
	public static void main(String [] args) {
		
		java.util.Scanner entrada = new java.util.Scanner(System.in);
		System.out.println(" Quantas notas ? : ");
		int nota  = entrada.nextInt();
		
		for (int i = 0; i < nota; i++) {
			Scanner notaAluno = new Scanner(System.in);
			System.out.println(" Nota : ");
			int notas  = notaAluno.nextInt();
			System.out.println(notaAluno + " ");
		}
		
	}

}
