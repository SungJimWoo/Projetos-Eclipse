package apresentacaodeagregassao.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	//Agregação
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	

}
