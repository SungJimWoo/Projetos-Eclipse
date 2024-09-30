package classesdojogo.test;

import classesdojogo.model.JogoDeCarta;
import classesdojogo.model.JogoDeTabuleiro;
import classesdojogo.model.VideoGame;

public class jogoTeste {

	public static void main(String[] args) {
		JogoDeCarta poker = new JogoDeCarta("Poker", 29.99, 52);
		JogoDeTabuleiro xadrez = new JogoDeTabuleiro("Xadrez", 49.99, 32);
		VideoGame ps5 = new VideoGame("Playstation 5", 7999.99, "Japão", "PS5 Pro");
	
		System.out.println(poker.detalhesJogo());
        System.out.println("---------------------------");
        System.out.println(xadrez.detalhesJogo());
        System.out.println("---------------------------");
        System.out.println(ps5.detalhesJogo());
        
	}

}
