package apresentacao.aplication;

import classe.model.Cliente;
import classe.model.Conta;

public class Main {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Pedro");
		cliente1.setCpf("08956214688");
		cliente1.setRg("845123654");

		conta1.setAgencia(120);
		conta1.setNumero(1234);
		conta1.setSaldo(100.00);
		conta1.setCliente(cliente1);

		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getSaldo());
		System.out.println("Nome: "+conta1.getCliente().getNome());
		System.out.println(conta1.toString());

		System.out.println("-------");

		Conta conta2 = new Conta();

		conta2.setAgencia(542);
		conta2.setNumero(69745);
		conta2.setSaldo(400.62);

		System.out.println("Sua agência: " + conta2.getAgencia());
		System.out.println(conta2.getNumero());
		System.out.println("Seu saldo: R$" + conta2.getSaldo());
		System.out.println(conta2);

	}
}
