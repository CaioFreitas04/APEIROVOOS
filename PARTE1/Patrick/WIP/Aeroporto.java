public class Aeroporto extends Cidade{
	private TrechoAereo Conexao:
	private String Aeroponto;
	private int CodAero:
	
	public Aeroporto(String X,int Y){
		SetPont(X);
		SetCod(Y);
	}
	
	public Void SetPont(Sting X){
		Aeroponto = X;
	}
	public Void SetCod(int X){
		CodAero = X;
	}
	public int GetPont(){
		return Aeroponto;
	}
	public String GetCod(){
		return CodAero;
	}
	
	
}