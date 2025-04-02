import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        double potencia, raiz;

        System.out.print("Informe o valor de x --> ");
        x = sc.nextInt();
        System.out.print("Informe o valor de y --> ");
        y = sc.nextInt();

        potencia = Math.pow(x, y);
        raiz = Math.sqrt(x+y);

        System.out.println(potencia);
        System.out.println(raiz);
    }
}
