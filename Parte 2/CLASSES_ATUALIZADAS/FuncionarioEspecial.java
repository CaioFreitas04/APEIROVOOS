import java.util.ArrayList;

public class FuncionarioEspecial extends Funcionario {
	
	/*
	private String nome;
	private String CPF;
	private String addr;
	private Data nasc;
	private String numCarteira;
	private float sal;
	private static float salMin;
	private boolean validCPF;
	*/
	private int numComiss;
	private ArrayList<Hotel> hotelList = new ArrayList();

	public FuncionarioEspecial(String nomein, String CPFin, String addrin, Data nascin, String numCartin) {
		super(nomein, CPFin, addrin, nascin, numCartin);
		this.numComiss = 0;
		this.sal = salMin;	
	}

	public void addHotel(Hotel hotelIn) {
		if(!validCPF) return;
		this.hotelList.add(hotelIn);
		this.numComiss++;
	}

	public void remHotel(Hotel hotelIn) {
		if(!validCPF) return;
		if(this.hotelList.remove(hotelIn))
			this.numComiss--;
	}
	
	public int getNumComiss() {
		return this.numComiss;
	}

	public void setSal(float salMult) {
		this.sal = salMult * Funcionario.getSalMin() + (0.05 * this.numComiss);
	}
	
}
