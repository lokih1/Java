import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {

    int n1 = 0, n2 = 1, n3 = 0, i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número da sequencia de fibonacci:");
        i = scan.nextInt();

        while (i > n3) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        if (i == 0) {
            System.out.println("O numero 0 está na sequencia de fibonacci. \nO proximo numero e: 1");
        } else if (i == n3) {
            System.out.println("O numero " + i + "esta na sequencia de fibonacci. \nO proximo numero e: " + (n1+ i));
            
        } else {
            System.out.println("Este numero não pertence a sequencia de fibonacci");
        }

    }

}
