import java.util.Scanner;


public class Main {

    public static void itIsNegativePositiveOrZeroNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero!");
        int num = scan.nextInt();

        if (num >= 1) {
            System.out.println("O número " + num + " é positivo!");
        } else if (num <= -1) {
            System.out.println("O número " + num + " é negativo!");
        } else {
            System.out.println("O número " + num + " é zero!");
        }
    }

    public static void verifyLargestNumber() {
        Scanner scan = new Scanner(System.in);
        int largestNum = 0;

        for (var i = 0; i < 3; i++) {
            System.out.println("Digite o " + i + " numero!");
            int num = scan.nextInt();

            if (num > largestNum) {
                largestNum = num;
            } else if (num < largestNum && num < 0 && i == 0) {
                largestNum = num;
            }
        }

        System.out.println("O número maior é: " + largestNum);
    }

    public static void countdown() {
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

    public static void verifyLeapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano:");
        int year = scan.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("O ano é bissexto!");
        } else {
            System.out.println("O ano NÃO é bissexto!");
        }
    }

    public static void verifyIfNumberIsPrimeNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número:");
        boolean ItsPrimeNumber = true;

        int num = scan.nextInt();

        for (var i = num; i > 1; i--) {
            if (num % i == 0 && i != num) ItsPrimeNumber = false;
        }

        if (ItsPrimeNumber) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é número primo");
        }
    }

    public static void verifyMedia() {
        Scanner scan = new Scanner(System.in);
        int sum = 0, media, qttNotes = 3;

        for (int i = 0; i < qttNotes; i++) {
            System.out.println("\nDigite a " + (i + 1) + " nota:");
            int num = scan.nextInt();
            sum += num;
        }

        media = sum / qttNotes;
        System.out.println("A média é: " + media);
        if (media >= 7) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você NÃO foi aprovado!");
        }

    }

    public static void MultplesOfFiveFromTheNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite um número (N):");
        int num = scan.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 5 == 0) System.out.println(i + " é múltiplo de 5\n");
        }
    }

    public static void MultplesOfFiveOrTreeFromTheNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite um número (N):");
        int num = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0 || i % 3 == 0) count++;
        }

        System.out.println("Há " + count + " números que obedecem a condição!");
    }

    public static void ProductFromOneNumberAndTheNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número (N):");
        int num = scan.nextInt();
        int numActually = 1;

        for (int i = 1; i <= num; i++) {
            numActually = (i * numActually);
        }
        System.out.println(numActually);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual questao voce quer fazer:\n1-Verificar se um número é positivo, n2egativo ou zero;\n2-Descobrir o maior entre três números!.\n3-Contagem regressiva de um numero ate 0\n4-Soma dos impares de 1 ate o numero que voce digitar\n5-Verificar se um ano é bissexto\n6-Verificar se um número é primo\n7-Calcular Média de 3 notas\n8-Exibir todos os múltiplos de 5 entre 1 e N.\n9-Contar quantos números entre 1 e N são divisíveis por 3 ou 5.\n10-Calcular o produto de todos os números de 1 até N");
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
            verifyLeapYear();
        } else if (option == 6) {
            verifyIfNumberIsPrimeNumber();
        } else if (option == 7) {
            verifyMedia();
        } else if (option == 8) {
            MultplesOfFiveFromTheNumber();
        } else if (option == 9) {
            MultplesOfFiveOrTreeFromTheNumber();
        } else if (option == 10) {
            ProductFromOneNumberAndTheNumber();
        } else {
            System.out.println("Digite uma opção válida!");
        }

    }
}