package vetores;

public class Vet04 {
    public static void main(String[] args) {
    
       String [] nomes = new String[3];
       nomes[0]="João";
       nomes[1]="Maria";

       for(int i=0;i<nomes.length;i++){
        System.out.println("O nome é: "+ i + "=" + nomes[i]);


       }
       
       for(String n : nomes){
            System.out.println(n);
       }

    }
}
