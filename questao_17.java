package lista_de_atividades;
import java.util.Scanner;
public class questao_17 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] arges){
        System.out.println("Declare um valor: ");
        double C = in.nextDouble();
        
        double P = (C / 2.54);

        System.out.println("O valor convertido para Polegadas é: " +P);
        
    }
}
