public class MaiorNumero {

	private int primeiroNumero;
	private int segundoNumero;

	public MaiorNumero(int primeiroNumero, int segundoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}

	public int getMaiorNumero() {
		if ( segundoNumero < primeiroNumero ) {
			return primeiroNumero;
		}
		return segundoNumero;
	}
}