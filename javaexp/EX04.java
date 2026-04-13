package javaexp;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            if (nome.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode ser vazio.");

            }
            System.out.println("Nome digitado: " + nome);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Fim.");
        }
    }
}
