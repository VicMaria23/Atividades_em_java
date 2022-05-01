package lista_de_atividades;
import java.util.Scanner;
public class questao_08 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um valor: ");
        double Kelvin = in.nextDouble();

        double Celsius = (Kelvin - 273.15);

        System.out.println("A temperatura em C é: " +Celsius);

    }
}
