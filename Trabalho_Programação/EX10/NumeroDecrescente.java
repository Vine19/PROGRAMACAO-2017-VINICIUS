public class NumeroDecrescente {

	private int numero;

	public NumeroDecrescente(int numero) {
		this.numero = numero;
	}

	public void imprimirNumeroDecrescente() {
		int numeroDescrecido = numero+1;
		for (int i = numero; i >= 0; i--) {
			numeroDescrecido = numeroDescrecido-1;
			System.out.println(numeroDescrecido);
		}
	}
}