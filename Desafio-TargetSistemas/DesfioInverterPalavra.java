import java.util.Scanner;

public class DesfioInverterPalavra {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("       Inverte Palavra       ");
        System.out.println("=============================\n");
        System.out.println("Digite uma palavra:");
        String palavra = ler.next();
        String palavraInvertida = "";

        for(int i = palavra.length() - 1; i>= 0; i--){
            palavraInvertida = palavraInvertida +  Character.toString(palavra.charAt(i));
        }
        
        System.out.println("\n");
        System.out.println(palavraInvertida);

        ler.close();
    }
}
