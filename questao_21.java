package lista_de_atividades;
import java.util.Scanner;
public class questao_21 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um valor: ");
        double MassaEmLibras = in.nextDouble();

        double MassaEmQuilogramas = (MassaEmLibras * 0.45);

        System.out.println("O valor convertido para Massa em Quilogramas é: " +MassaEmQuilogramas);
    }
}
