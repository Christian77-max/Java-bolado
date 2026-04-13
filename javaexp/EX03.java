package javaexp;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            System.out.println("Você digitou: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
        } finally {
            scanner.close();
            System.out.println("Programa executado.");
        }
    
}
}

