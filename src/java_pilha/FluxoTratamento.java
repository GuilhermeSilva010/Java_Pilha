package java_pilha;

public class FluxoTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exeception "+ msg);
			ex.printStackTrace();
		}
		System.out.println("fim do main");
	}
	
	private static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	//Aplicando o exception, checked (são verificados pelo compilador)
	
	private static void metodo2() throws MinhaException {
		System.out.println("ini do metodo2");
		throw new MinhaException("deu errado");
		
		//System.out.println("fim do metodo2");
	}
}
