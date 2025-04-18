import Models.Operadores;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float v1 = scanner.nextFloat();
        System.out.print("Digite o segundo numero: ");
        float v2 = scanner.nextFloat();

        Operadores ops = new Operadores(v1,v2);

        System.out.println("Digite a operação:\n(1- adição, 2- subtração, 3- multiplicação e 4- divisão) ");
        int operacao = scanner.nextInt();

        switch (operacao){
            case 1 -> System.out.println("O resultado é: "+ops.adicao(v1,v2));
            case 2 -> System.out.println("O resultado é: "+ops.subtracao(v1,v2));
            case 3 -> System.out.println("O resultado é: "+ops.multiplicacao(v1,v2));
            case 4 -> {
                if (v2 == 0){
                    System.out.println("Não existe divisão com zero");
                }else{
                    System.out.println("O resultado é: "+ops.divisao(v1,v2));
                }
            }
            default -> System.out.println("Não existe essa operação");
        }

    }
}
