import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void itIsNegativePositiveOrZeroNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero!");
        int num = scan.nextInt();

        if(num >= 1) {
            System.out.println("O número " + num + " é positivo!");
        } else if (num <= -1) {
            System.out.println("O número " + num + " é negativo!");
        } else {
            System.out.println("O número " + num + " é zero!");
        }
    }

    public static  void verifyLargestNumber() {
        Scanner scan = new Scanner(System.in);
        int largestNum = 0;

        for (var i = 0; i < 3; i++) {
            System.out.println("Digite o " + i + " numero!");
            int num = scan.nextInt();

            if(num > largestNum) {
                largestNum = num;
            } else if(num < largestNum && num < 0 && i == 0) {
                largestNum = num;
            }
        }

        System.out.println("O número maior é: " + largestNum);
    }

    public static  void countdown() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number:");
        int num = scan.nextInt();

        System.out.println("Contagem regressiva:\n");
        int i;
        for (i = 0; num >= i; num--) {
            System.out.println(num);
        }
    }

    public static void sumOdds() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número:");
        int num = scan.nextInt();

        int i, sum = 0;
        for (i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println("A soma dos números ímpares é: " + sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual questao voce quer fazer:\n1-Verificar se um número é positivo, n2egativo ou zero;\n2-Descobrir o maior entre três números!.\n3-Contagem regressiva de um numero ate 0\n4-Soma dos impares de 1 ate o numero que voce digitar\n5-Fazer Triangulo a partir de um numero\n6-Triangulo igual ao de cima, só que de cabeça para baixo7- ");
        int option = scan.nextInt();

        if (option == 1) {
            itIsNegativePositiveOrZeroNumber();
        } else if (option == 2) {
            verifyLargestNumber();
        } else if (option == 3) {
            countdown();
        } else if (option == 4) {
            sumOdds();
        } else if (option == 5) {

        } else if (option == 6) {

        } else {
            System.out.println("Digite uma opção válida!");
        }

    }
}