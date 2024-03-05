public class Passagem {
	private voo Voo;
	private float preco;
	private float precoPrimeiraClasse;

	public Passagem(voo vooin, float precoin, float precoPrimin) {
		this.Voo = vooin;
		if(precoin > 0)
			this.preco = precoin;
		if(precoPrimin > 0)
			this.precoPrimeiraClasse = precoPrimin;
	}

	public voo getVoo() {
		return this.Voo;
	}

	public float getPreco() {
		return this.Preco;
	}

	public float getPrecoPrimeiraClasse() {
		return this.precoPrimeiraClasse;
	}
}
