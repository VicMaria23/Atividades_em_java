package lista_de_atividades;
import java.util.Scanner;
public class questao_14 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um número");
        double G = in.nextDouble();

        double R = (G * 3.14 / 180);

        System.out.println("O valor convertido em Radiano: " +R);
    }
}
