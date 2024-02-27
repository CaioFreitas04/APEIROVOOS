public class Hora {
	
	private int h, m, s;
	
	public Hora(int hi, int mi, int si) {
		//checando se o tempo é valido;
		if (hi > 23 || hi < 0)
			h = 0;
		else
			h = hi;
		
		if (mi > 59 || mi < 0)
			m = 0;
		else
			m = mi;
		
		if (si > 59 || si < 0)
			s = 0;
		else
			s = si;
	}
	
	public void setHora(int hi, int mi, int si) {
		//checando se o tempo é valido;
		if (hi > 23 || hi < 0)
			h = h;
		else
			h = hi;
		
		if (mi > 59 || mi < 0)
			m = m;
		else
			m = mi;
		
		if (si > 59 || si < 0)
			s = s;
		else
			s = si;
	}
	
	public int getHora(char MODE) {
		switch(MODE) {
			case 'h': return h;
			case 'm': return m;
			case 's': return s;
			default: return -1;
		}
	}
}