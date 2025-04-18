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

        System.out.print("(1- adição, 2- subtração, 3- multiplicação e 4- divisão)\nDigite a operação: ");
        int operacao = scanner.nextInt();

//        if (operacao==1){
//            System.out.println("O resultado é: "+ops.adicao(v1,v2));
//        } else if (operacao==2) {
//            System.out.println("O resultado é: "+ops.subtracao(v1,v2));
//        } else if (operacao==3) {
//            System.out.println("O resultado multiplicação é: "+ops.multiplicacao(v1,v2));
//        } else if(operacao==4){
//            if (v2 == 0){
//                System.out.println("Não existe divisão com zero");
//            } else{
//                System.out.println("O resultado da divisão é: "+ops.divisao(v1,v2));
//            }
//        } else{
//            System.out.println("Não existe essa operação");
//        }

        switch (operacao){
            case 1 -> System.out.println("O resultado da adição é: "+ops.adicao(v1,v2));
            case 2 -> System.out.println("O resultado da subtração é: "+ops.subtracao(v1,v2));
            case 3 -> System.out.println("O resultado multiplicação é: "+ops.multiplicacao(v1,v2));
            case 4 -> {
                if (v2 == 0){
                    System.out.println("Não existe divisão com zero");
                }else{
                    System.out.println("O resultado da divisão é: "+ops.divisao(v1,v2));
                }
            }
            default -> System.out.println("Não existe essa operação");
        }

    }
}
