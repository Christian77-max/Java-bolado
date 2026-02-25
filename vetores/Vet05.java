package vetores; 

import java.util.Scanner;


public class Vet05 {
    public static void main(String[] args) {
        
      Scanner sc = new java.util.Scanner(System.in);

        String [] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o nome "+i+": ");
            nomes[i] = sc.nextLine();
        }
    }

    
}
