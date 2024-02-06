public class Test{
		public static void main(String args[]) {
		Data D = new Data(22, 3, 2004);
		Data D2 = new Data(11, 09, 2001);
		
		System.out.println(D.getData('h') + " " + D.getData('m') + " "  + D.getData('s'));
		System.out.println(D2.getData('h') + " "  + D2.getData('m') + " "  + D2.getData('s'));
		
		D.SetData(0, 0, 0);
		D.SetData(39, 13, 0);
		
		System.out.println(D.getData('h') + " "  + D.getData('m') + " "  + D.getData('s'));
		System.out.println(D2.getData('h') + " "  + D2.getData('m') + " "  + D2.getData('s'));
}