package lista_de_atividades;
import java.util.Scanner;
public class questao_04 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um número: ");
        double num = in.nextDouble();

        double quadrado = (num * num);

        System.out.println("O quadrado deste número é: " +quadrado);

    }
}
