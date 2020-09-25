package java_pilha;

public class TestaExecaoChecked {
	//duas maneiras de tratar exceçoes, usando try, catch.. ou colocando throws na assinatura do metodo
	
	public static void main(String[] args){
		
		Conta c = new Conta();
		try {
		c.deposita();
		} catch(MinhaException ex) {
			System.out.println("tratamento");
		}
	}
}
