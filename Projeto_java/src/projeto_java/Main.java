package projeto_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Qual seu nome?");
		nome = ler.next();
		System.out.println("Qual sua idade?");
		idade = ler.nextInt();
		
		System.out.println("Olá "+nome+ ", Seja bem vindo de volta! \nVocê tem "+idade+ " Anos de idade.");

		/*
		 * A partir de 18 anos - voto é obrigatório
		 * 16 e 17 anos - voto opcional
		 * menores de 16 - não vota
		 */
		
		
		if (idade >= 18) {
			System.out.println("Seu voto é obrigatório!");
		} else  if (idade == 16 || idade == 17) {
			System.out.println("Seu voto é opcional!");
		} else {
			System.out.println("Você não vota");
		}
		
		
	}

}
