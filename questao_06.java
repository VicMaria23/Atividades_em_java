package lista_de_atividades;
import java.util.Scanner;
public class questao_06 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um número: ");
        double celsius = in.nextDouble();

        double Fahrenheit = (celsius * (9.0 / 5.0) + 32.0);

        System.out.println("A temperatura em F é: " +Fahrenheit);
    }
}
