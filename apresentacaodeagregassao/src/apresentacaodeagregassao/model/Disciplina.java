package apresentacaodeagregassao.model;

public class Disciplina {

	private String nome;
	private boolean status;//true (cursado), false (a cursar)
	private double nota;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
}
