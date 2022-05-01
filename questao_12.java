package lista_de_atividades;
import java.util.Scanner;
public class questao_12 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um valor em Milhas: ");
        double M = in.nextDouble();

        double Km = (1.61 * M);

        System.out.println("O valor convertido para Quilômetro é: " +Km+  " Km");
    }
}
