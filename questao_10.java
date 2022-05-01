package lista_de_atividades;
import java.util.Scanner;
public class questao_10 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um valor em quilometros por hora: ");
        double K = in.nextDouble();

        double metrosporsegundo = (K / 3.6);

        System.out.println("O valor em Metros Por Segundo é: " +metrosporsegundo);
        
    }
}
