
public class contador1 {
    public static void main(String[] args) {
        int contador = 1;

        System.out.println("Iniciando o contador: ");

        do {
            System.out.println("contador: " +contador);
            contador++; //Incrementa o contador a cada interação
        } while (contador <= 5);

        System.out.println("Fim de de laço.");
    }
}
