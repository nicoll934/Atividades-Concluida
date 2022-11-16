public class Ex2 {
    public static void main(String[] args) {
    int fileiras = 10;
     int cadeiras = 8;
     int resultado = 80;
     int reservados = 10;
     int totalReservado = (resultado * reservados) / 100;

     System.out.println("A sala de cinema tem " +fileiras+ " fileiras e " +cadeiras+ " cadeiras em cada ");
     System.out.println(" A capacidade dessa sala é de " +resultado);
     System.out.println("Total reservado é " + totalReservado);
    }
}
