package apresentacaodeagregassao.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import apresentacaodeagregassao.model.Aluno;
import apresentacaodeagregassao.model.Disciplina;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String alunoNome;
		String matricula;
		String curso;
		
		String nomeDisciplina;
		boolean status = false;
		double nota = 0.0;
		
		Aluno aluno1 = new Aluno();
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();
		Disciplina disciplina3 = new Disciplina();
		Disciplina disciplina4 = new Disciplina();
		
		System.out.println("Informe o nome do Aluno: ");
		alunoNome = ler.next();
		System.out.println("Informe a matricula: ");
		matricula = ler.next();
		System.out.println("Informe o curso: ");
		curso = ler.next();
		
		System.out.println("---- Informe a displina 1: ----");
		System.out.println("Nome? ");
		nomeDisciplina = ler.next();
		
		aluno1.setCurso(curso);
		aluno1.setNome(alunoNome);
		aluno1.setMatricula(matricula);
		
		disciplina1.setNome(nomeDisciplina);
		disciplina2.setNome("Português");
		disciplina3.setNome("Matemática");
		disciplina4.setNome("História");
		
		disciplinas.add(disciplina1);
		disciplinas.add(disciplina2);
		disciplinas.add(disciplina3);
		disciplinas.add(disciplina4);

		aluno1.setDisciplinas(disciplinas);
		
		System.out.println("Listagem de Disciplinas");
		
		for (Disciplina d : disciplinas) {
			System.out.println("Disciplina: " +d.getNome());
		}
	}

}
