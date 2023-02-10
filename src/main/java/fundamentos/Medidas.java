// 1 - Pacote - conjunto de classes
package fundamentos;

// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos

    static Scanner entrada;

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {  // nome do primeiro método sempre tem que ser esse
        String opcao = " ";
        int area = 0;

        entrada = new Scanner(System.in);
// toUpperCase converte para maiúsculo
        while (!opcao.toUpperCase().equals("S")) { // != significa diferente e && significa "e".

            System.out.println("Escolha o Cálculo Desejado");
            System.out.println("(1) - Area do Quadrado");
            System.out.println("(2) - Area do Retangulo");
            System.out.println("(3) - Area do Triangulo");
            System.out.println("(4) - Area do Circulo"); // CTRL + D duplica o último registro
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(8) - Divisão por Zero");
            System.out.println("(S) - Sair");

            opcao = entrada.nextLine(); // Quando é texto, usa o nextLine
            switch (opcao) {
                case "1":
                    area = calcularAreadoQuadrado();
                    break;
                case "2":
                    // A fazer: calcular área do retângulo
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "s":
                case "S":
                    System.out.println("Agradecemos pela preferência!");
                    break;
                case "8":
                    divisaoPorZero();
                    break;
                default:
                    System.out.println("Opcao Invalida: " + opcao); // Tratamento de erro
            }
            if (area > 0) {
                System.out.println("A área é de " + area + "m2");
            }

        }

    }

    public static int calcularAreadoQuadrado() {

        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado. nextInt é ler o próximo inteiro

        // Desenhar o quadrado
        for (int linha = 1; linha <= lado; linha++) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#"); // O println exibe a mensagem na tela e pula de linha. O print só exibe
            }
            System.out.println(); // print vazio para pular de linha
        }
        System.out.println(); // print vazio para pular de linha
        return lado * lado; // ou lado ^ 2 // O return sempre deve ser a última linhha
    }


    public static void tabuada() {
        System.out.println("Você quer calcular a tabuada de qual número?");
        byte numero = entrada.nextByte(); // byte é um número entre 0 e 255

        for (byte i = 1; i <= 10; i++) {
            System.out.print(numero * i + " ");
        }
    }


    public static void fibonacci() {
        System.out.println("Quantos números deseja calcular na sequência?");
        byte numero = entrada.nextByte();

        switch (numero) {
            case 0:
                System.out.println("A sequência está vazia.");
                break;
            case 1:
                System.out.println("Sequência de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.print("Sequência de Fibonacci: 1 ");
                for (byte i = 2; i <= numero; i++) {
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }
        }
    }

    public static void contagemRegressiva() {
        System.out.print("Começar a contagem a partir de qual número? ");
        int numero = entrada.nextInt();

        System.out.println("Diminuindo de quantos em quantos números por vez? ");
        int decrescimo = entrada.nextInt();

        for (int i = numero; i >= 1; i -= decrescimo) {
            System.out.println(i);

        }

    }

    public static void divisaoPorZero() {
        System.out.print("Qual é o dividendo? (número a ser dividido) ");
        byte dividendo = entrada.nextByte();
        System.out.print("Qual é o divisor? (número que divide o dividendo) ");
        byte divisor = entrada.nextByte();


        try {
            System.out.println("O resultado é: " + dividendo / divisor);
        } catch (Exception e) {
            //String erro = e.getMessage();
                    System.out.println("Mensagem temporária em Inglês: " + e.getMessage());
            }
        finally {
            System.out.println("Por hoje é só, pessoal!");

        }
    }
}


