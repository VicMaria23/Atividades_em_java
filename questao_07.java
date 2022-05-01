package lista_de_atividades;
import java.util.Scanner;
public class questao_07 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um valor: ");
        double Fahrenheit = in.nextDouble();

        double Celsius = (5.0 * (Fahrenheit - 32.0) / 9.0);

        System.out.println("A temperatura em C é: " +Celsius);
        
    }
}
