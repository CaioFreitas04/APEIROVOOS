public class Lugar{
	protected String Continente;
	protected int FusoHorarioD;
	protected int FusoHorarioH;
	
	public Lugar(String Y,int X){
		SetFuso(X);
		SetCont(Y);
	}
	
	
	public void SetFuso(int X){
		int Dia=0,Fuso=0;
		
		if(X==24){
			Dia =1;
		}
		else if(X>24){
			Dia = X/24;
			Fuso = X%24;
		}else{
			Fuso = X;
		}
		FusoHorarioD = Dia;
		FusoHorarioH = Fuso;
	}

	public void SetCont(String X){
		Continente = X;
	}
	
}