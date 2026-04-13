package javaexp;
public class EX01 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");

        }
        finally {
            System.out.println("programa executado.");
        }
      
    }
}