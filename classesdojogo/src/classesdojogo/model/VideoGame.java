package classesdojogo.model;

public class VideoGame extends Jogo{

	private String paisDeOrigem;
	private String modelo;
	
	public VideoGame(String nomeJogo, double preco, String paisDeOrigem, String modelo) {
		super(nomeJogo, preco);
		this.paisDeOrigem = paisDeOrigem;
		this.modelo = modelo;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String detalhesJogo() {
		return 	"Nome do Jogo: " +getNomeJogo()+ "\n" +
				"Preço: R$" +getPreco()+ "\n" +
				"País de Origem: " +paisDeOrigem+ "\n" + 
				"Modelo do VideoGame: " +modelo;
	}
}
