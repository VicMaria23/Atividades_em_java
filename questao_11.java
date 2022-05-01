package lista_de_atividades;
import java.util.Scanner;
public class questao_11 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um valor em metros por segundo: ");
        double Ms = in.nextDouble();

        double KmH = (Ms * 3.6);

        System.out.println("o valor convertido em KmH é: " +KmH);
    }
}
