import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double valorDaAula, porcentagem;
        int totalDeAula;
        double salarioBruto, salarioLiquido, desconto;

        // entrada de dados
        System.out.print("Valor da aula --> R$ ");
        valorDaAula = sc.nextDouble();
        System.out.print("Porcentagem do INSS --> ");
        porcentagem = sc.nextDouble();
        System.out.print("Total de aulas --> ");
        totalDeAula = sc.nextInt();

        // processamento
        salarioBruto = totalDeAula * valorDaAula;
        desconto = salarioBruto * porcentagem / 100;
        salarioLiquido = salarioBruto - desconto;

        // saída de dados
        System.out.println("Salário bruto --> R$ " + df.format(salarioBruto));
        System.out.println("Desconto do INSS --> R$ " + df.format(desconto));
        System.out.println("Salário líquido --> R$ " + df.format(salarioLiquido));

    }
}
