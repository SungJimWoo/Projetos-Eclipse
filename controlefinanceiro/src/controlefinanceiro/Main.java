package controlefinanceiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int mes;
		String descDividaString;
		double preco;
		boolean status;
		int pago;
		
		Lista listaSupermercado = new Lista();
		Item item1 = new Item();
		Item item2 = new Item();
		
		System.out.println("Informe o mês de [1 a 12] ");
		mes = ler.nextInt();
		System.out.println("Descrição da dívida: ");
		descDividaString = ler.next();
		System.out.println("Informe o preço? ");
		preco = ler.nextDouble();
		System.out.println("Está pago?\n1.SIM\n2.NÃO");
		pago = ler.nextInt();
		status = (pago == 1) ? true : false;
		
		listaSupermercado.setMes(mes);
		item1.setNome(descDividaString);
		item1.setPreco(preco);
		item1.setStatus(status);
		listaSupermercado.getItens().add(item1);
		
		System.out.println("Informe o mês de [1 a 12] ");
		mes = ler.nextInt();
		System.out.println("Descrição da dívida: ");
		descDividaString = ler.next();
		System.out.println("Informe o preço? ");
		preco = ler.nextDouble();
		System.out.println("Está pago?\n1.SIM\n2.NÃO");
		pago = ler.nextInt();
		status = (pago == 1) ? true : false;
		
		listaSupermercado.setMes(mes);
		item2.setNome(descDividaString);
		item2.setPreco(preco);
		item2.setStatus(status);
		listaSupermercado.getItens().add(item2);
		
		System.out.println("=== LISTA DE CONTROLE DE FINANCEIRO ===");
		System.out.println("Mês: " +listaSupermercado.getMes());
		System.out.println("Item 1: " +listaSupermercado.getItens());
		System.out.println("Total que foi pago: " +listaSupermercado.calcularTotalPago());
		System.out.println("Total pendente: " +listaSupermercado.calcularTotalPendente());
		ler.close();
	}
	
}
