public class Arrays {

	private int[] arrayInt;
	public void setQuantidade(int quant) {
		arrayInt = new int[quant];
	}

	public void setValorEPosicao(int posicao, int valor) {
		if (arrayInt != null) {
			arrayInt[posicao] = valor;
		}
	}

	public int somaInt() {
		int total = 0;

		for (int i = 0; i < arrayInt.length; i++) {
			total += arrayInt[i];
		}
		return total;
	}
}