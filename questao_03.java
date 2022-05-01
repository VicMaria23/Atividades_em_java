package lista_de_atividades;
import java.util.Scanner;
public class questao_03 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Digite o primeiro número: ");
        int num1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = in.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = in.nextInt();

        int soma = (num1 + num2 + num3);

        System.out.printf("A soma dos números é: " +soma);

    }
}
