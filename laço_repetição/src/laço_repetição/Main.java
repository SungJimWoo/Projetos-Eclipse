package laço_repetição;

public class Main {

	public static void main(String[] args) {
		int k = 0;
		int i = 0;
		
		while (i <= 10) { //enquanto
			System.out.println(i);
			i++;
		}
		
		System.out.println("--- REPITA ---");
		i = 1;
		//Repita (Pelo menos uma vez ele vai entrar no laço)
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);
		
		System.out.println("--- FOR ---");
		for (int j = 0; j < 6; j++) {
			System.out.println(k = j + i);
		}
	}

}
