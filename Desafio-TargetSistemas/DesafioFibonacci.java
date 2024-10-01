import java.util.Scanner;

public class DesafioFibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("     Sequência Fibonacci       ");
        System.out.println("=============================\n");
        System.out.println("Digite um número: ");
        int numero = ler.nextInt(); 
         
        boolean pertence = false;

        int f1 = 0;
        int f2 = 1;

        for(int i = 0; i < 20; i++){
            System.out.println(f1);
            f2 = f1 + f2;
            f1 = f2 - f1;
            if(numero == f1){
                pertence = true;
        }}

        System.out.println("\n");
        if(pertence){
            System.out.println(numero + " pertence a sequência de Fibonacci. ");
        } else{
            System.out.println(numero + " não pertence a sequência de Fibonacci. ");
        }

        
        ler.close();
    }
}
