package lista_de_atividades;
import java.util.Scanner;
public class questao_13 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um valor em Quilômetro: ");
        double Km = in.nextDouble();

        double M = (Km / 1.61);

        System.out.println("O valor convertido para Milhas é: " + M +  " milhas.");

    }
}
