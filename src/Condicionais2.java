import java.util.Scanner;

public class Condicionais2 {
    public static void main(String[] args) {

        Scanner temper = new Scanner(System.in);
         String letras;
         double temperatura;
         double resulCelsius;
         double resulFarenheit;

        System.out.println("Digite o valor da temperatura");
        temperatura = temper.nextDouble();

        Scanner letra = new Scanner(System.in);
        System.out.println("Digite se a temperatura esta em C ou F ");
        letras = letra.nextLine();

        if (letras.equals("C")){
            System.out.println("A temperatura informada foi " + temperatura + " Celsius.");
            resulCelsius = (temperatura * 9/5) + 32;
            System.out.println("Ela equivale á " + resulCelsius + " Farenheit.");
        } else if (letras.equals("F")){
            System.out.println("A temperatura informada foi " + temperatura + "Farenheit");
            resulFarenheit =(temperatura - 32) * 5/9;
            System.out.println("Ela equivale á " + resulFarenheit + " Celsius.");
        } else {
            System.out.println(" A letra " + letras + " não corresponde a uma unidade de médida");
        }












    }
}
