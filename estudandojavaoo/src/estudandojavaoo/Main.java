package estudandojavaoo;

import java.util.Scanner;

import model.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in); //Entrada e Recebimento de valores
		
		String nome;
		String cpf;
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Informe o nome: ");
		nome = read.next();
		System.out.println("Informe o cpf: ");
		cpf = read.next();
		System.out.println("Informe a nota 1: ");
		nota1 = read.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = read.nextDouble();
		System.out.println("Informe a nota 3: ");
		nota3 = read.nextDouble();
		System.out.println("Informe a nota 4: ");
		nota4 = read.nextDouble();
		
		aluno1.setNome(nome);
		aluno1.setCpf(cpf);
		aluno1.setNota1(nota1);
		aluno1.setNota1(nota2);
		aluno1.setNota1(nota3);
		aluno1.setNota1(nota4);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getIdade());
		System.out.println(aluno1.getNomeMae());
		System.out.println(aluno1.getNota1());
		System.out.println(aluno1.getNota2());
		System.out.println(aluno1.getNota3());
		System.out.println(aluno1.getNota4());
		
		System.out.println("Média do aluno: " +aluno1.calcularMediaAluno());
		System.out.println("Situação do aluno: " +(aluno1.alunoAprovado() ? "Aprovado" : "Reprovado"));
		
		read.close();;
		/*
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Ricardo");
		aluno2.setCpf("1515565464");
		aluno2.setNota2(7);
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais!");
		} else {
			System.out.println("Alunos são diferentes!");
		}
		
		/*
		System.out.println(aluno.toString()); //Objeto na memória
		
		aluno.setNome("Maria");
		aluno.setIdade(21);
		aluno.setNomeMae("Patricia");
		aluno.setNota1(6.5);
		aluno.setNota2(7);
		aluno.setNota3(8);
		aluno.setNota4(5);
		
		System.out.println(aluno.toString());
		
		/*Aluno aluno2 = new Aluno("João", 18);
		aluno2.setNomeMae("Joana");
		
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getIdade());
		System.out.println(aluno2.getNomeMae());
		*/
	}

}
