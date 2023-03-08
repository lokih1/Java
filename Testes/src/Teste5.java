import java.util.Scanner;
public class Teste5 {
    public static void main(String[] args){
        Scanner Reader = new Scanner(System.in);
        String Entrada = Reader.next();
        String Saida = "";

        for (int i = Entrada.length() - 1; i >= 0 ; i-- ){
            Saida = Saida + Entrada.charAt(i);
        }
        System.out.println(Saida);
    }
}
