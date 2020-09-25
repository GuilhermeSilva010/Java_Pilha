package java_pilha;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("AritmeticExeception "+ ex);
		}
		System.out.println("fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	//dando erro e como resolver as exceção 
	
	private static void metodo2() {
		System.out.println("ini do metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		int a = i / 0;
		}
		System.out.println("fim do metodo2");
	}
}
