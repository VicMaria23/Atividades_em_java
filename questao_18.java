package lista_de_atividades;
import java.util.Scanner;
public class questao_18 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] arges){
        System.out.println("Declare um valor");
        double MetrosCubicos = in.nextDouble();

        double Litros = (1000 * MetrosCubicos);

        System.out.println("O Valor convertido para Litros é: " +Litros);
    }
}
