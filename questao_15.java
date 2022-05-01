package lista_de_atividades;
import java.util.Scanner;
public class questao_15 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um número");
        double R = in.nextDouble();

        double G = (R * 180 / 3.14);

        System.out.println("O valor convertido em Graus: " +G);
    }
}
