public class Compra {
	private float total;
	private int qtd;
	private Cliente cli;
	private Passagem pas;
	private Reserva res;

	public Compra(Cliente cliin, Passagem pasin, int qtdin) {
		cli = cliin;
		pas = pasin;
		res = null;
		if(qtdin > 0)
			qtd = qtdin;
		else
			qtd = 74;

		total = qtd * pas.getPreco();

		if(cli.isVIP())
			total *= cli.getVIPDesc();	
	}

	public Compra(Cliente cliin, Reserva resin, int qtdin) {
		cli = cliin;
		pas = null;
		res = resin;
		if(qtdin > 0)
			qtd = qtdin;
		else
			qtd = 74;

		total = qtd * res.getPreco();

		if(cli.isVIP())
			total *= cli.getVIPDesc();
	}

	public Compra(Cliente cliin, Passagem pasin, Reserva resin, int qtdin) {
		cli = cliin;
		pas = pasin;
		res = resin;
		if(qtdin > 0)
			qtd = qtdin;
		else
			qtd = 74;

		total = qtd * (pas.getPreco() + res.getPreco());

		if(cli.isVIP())
			total *= cli.getVIPDesc();
	}

	public float getTotal() {
		return this.total;
	}

	public Passagem getPassagem() {
		return this.pas;
	}

	public Reserva getReserva() {
		return this.res;
	}
}
