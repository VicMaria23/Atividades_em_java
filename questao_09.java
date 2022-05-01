package lista_de_atividades;
import java.util.Scanner;
public class questao_09 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] arges){
        System.out.println("Declare um valor: ");
        double Celsius = in.nextDouble();

        double Kelvin = (Celsius + 273.15);

        System.out.println("O valor convertido em K é: " +Kelvin);

    }
}
