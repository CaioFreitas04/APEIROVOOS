package vision;
import java.io.Serializable;

public class Passagem implements Serializable {
	private voo Voo;
	private double preco;

	public Passagem(voo vooin, double precoin) {
		this.Voo = vooin;
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
