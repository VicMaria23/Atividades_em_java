package lista_de_atividades;
import java.util.Scanner;
public class questao_16 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] arges){
        System.out.println("Declare um valor: ");
        double P = in.nextDouble();
        
        double C = (P * 2.54);

        System.out.println("O valor convertido para Centímetros é: " +C);
    }
}
