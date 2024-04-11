package vision;
public class Passagem {
	private voo Voo;
	private double preco;
	private int Cod;
	private static int QtdTotal = 0;

	public Passagem(voo vooin, double precoin) {
		this.Voo = vooin;
		Cod = QtdTotal;
		QtdTotal++;
		
		if(precoin > 0)
			this.preco = precoin;
	}

	public voo getVoo() {
		return this.Voo;
	}

	public double getPreco() {
		return this.preco;
	}

}

