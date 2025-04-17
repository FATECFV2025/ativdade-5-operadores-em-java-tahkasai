import Models.Operadores;
import java.util.Scanner;

public class Main {
    public static void funcao_teste (){
        Scanner scanner = new Scanner(System.in);

        float v1 = scanner.nextFloat();
        float v2 = scanner.nextFloat();

        Operadores ops = new Operadores(v1,v2);

        System.out.println(ops.getP1()+" "+ops.getP2());
    }
}
