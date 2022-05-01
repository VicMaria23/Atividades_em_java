package lista_de_atividades;
import java.util.Scanner;
public class questao_05 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Declare um núumero: ");
        double num = in.nextDouble();

        double quintaparte = (num / 5);

        System.out.println("A quinta parte deste número é: " +quintaparte);
    }
}
