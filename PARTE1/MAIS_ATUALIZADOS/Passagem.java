public class Passagem {
	private voo Voo;
	private float preco;

	public Passagem(voo vooin, float precoin) {
		this.Voo = vooin;
		if(precoin > 0)
			this.preco = precoin;
	}

	public voo getVoo() {
		return this.Voo;
	}

	public float getPreco() {
		return this.Preco;
	}

}
