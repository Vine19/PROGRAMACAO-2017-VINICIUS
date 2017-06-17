
public class Endereco {

	private String rua;
	private String cep;

	public void setCep(int cep) {
		String cepString = "" + cep;
		String primeiros5Digitos = cepString.substring(0, 5);
		String ultimos3Digitos = cepString.substring(5, 8);
		this.cep = primeiros5Digitos+"-"+ultimos3Digitos;
	}

	public String getCep() {
		return cep;
	}
}