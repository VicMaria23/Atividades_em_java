package lista_de_atividades;
import java.util.Scanner;
public class questao_20 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] arges){
        System.out.println("Declare um valor: ");
        double MassaEmQuilogramas = in.nextDouble();

        double MassaEmLibras = (MassaEmQuilogramas / 0.45);

        System.out.println("O valor convertido para Massa em Libras é: " +MassaEmLibras);
    }
}
