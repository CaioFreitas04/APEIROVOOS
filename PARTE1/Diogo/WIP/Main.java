public class Main {
    public static void main(String[] args) {

      Quarto q1 = new Quarto(1000, 2);
      Quarto q2 = new Quarto(1000, 2);
      Quarto q3 = new Quarto(1000, 2);
      Quarto q4 = new Quarto(1000, 2);

      Data d1 = new Data(1, 1, 2000);
      Data d2 = new Data(2, 4, 2000);

      System.out.print("Data de teste: " + d1.getData('d') + "/" + d1.getData('m') + "/" + d1.getData('a') + "\n\n");

      boolean x = q1.estaLivreEmTalDia(d1);

      System.out.print("Data de teste: " + d1.getData('d') + "/" + d1.getData('m') + "/" + d1.getData('a') + "\n\n");

      reserva r1 = new reserva(q1, d1, d2);

      System.out.print("Data de teste: " + d1.getData('d') + "/" + d1.getData('m') + "/" + d1.getData('a') + "\n\n");

      System.out.println("Preco: " + r1.getPreco());
System.out.println("Checkin: " + r1.getDiaCheckin().getData('d') + "/" + r1.getDiaCheckin().getData('m') + "/" + r1.getDiaCheckin().getData('a'));
System.out.println("Checkout: " + r1.getDiaCheckout().getData('d') + "/" + r1.getDiaCheckout().getData('m') + "/" + r1.getDiaCheckout().getData('a'));


      
    }
}
