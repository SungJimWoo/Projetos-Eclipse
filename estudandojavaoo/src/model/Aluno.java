package model;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	private String dataNascimento;
	private String rg;
	private String cpf;
	private String nomeMae;
	private String dataMatricula;
	private String curso;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	
	public double calcularMediaAluno() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	public boolean alunoAprovado() {
		double media = calcularMediaAluno();
		
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, curso, dataMatricula, dataNascimento, idade, nome, nomeMae, nota1, nota2, nota3, nota4,
				rg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(curso, other.curso)
				&& Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeMae, other.nomeMae)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4)
				&& Objects.equals(rg, other.rg);
	}

	
	
	
}
