package lista_de_atividades;
import java.util.Scanner;
public class questao_19 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um valor");
        double Litros = in.nextDouble();

        double MetrosCubicos = (Litros / 1000);

        System.out.println("O Valor convertido para Metros Cúbicos é: " +MetrosCubicos);
    }
}
