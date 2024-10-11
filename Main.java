import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //Está sem passar nada dentro dos parênteses porque, por padrão, quando não definimos um construtor na classe, o Java cria automaticamente um construtor padrão sem parâmetros.
        Calculadora calculo = new Calculadora();
        try (Scanner input = new Scanner(System.in)) {

            int opcao = 0;
            while (opcao <= 5){
                System.out.println("Qual operação você deseja realizar: ");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Sair");
                
                opcao = input.nextInt();

                if (opcao == 1) {
                    System.out.println("Digite o primeiro número: ");
                    int valorA = input.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int valorB = input.nextInt();

                    System.out.println("RESULTADO = " + calculo.getSoma(valorA, valorB));
                    System.out.printf("\n");
                }else if (opcao == 2) {
                    System.out.println("Digite o primeiro número: ");
                    int valorA = input.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int valorB = input.nextInt();

                    System.out.println("RESULTADO = " + calculo.getSubtracao(valorA, valorB));
                    System.out.printf("\n");
                }else if (opcao == 3) {
                    System.out.println("Digite o primeiro número: ");
                    int valorA = input.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int valorB = input.nextInt();

                    System.out.println("RESULTADO = " + calculo.getMultiplicacao(valorA, valorB));
                    System.out.printf("\n");
                }else if (opcao == 4) {
                    System.out.println("Digite o primeiro número: ");
                    int valorA = input.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int valorB = input.nextInt();

                    System.out.println("RESULTADO = " + calculo.getDivisao(valorA, valorB));
                    System.out.printf("\n");
                }else{
                    break;
                }
            }


        }
    }
}
