package Java.EstruturaDecisaoIf;

import java.util.Scanner;

public class DecisaoIf {
    Scanner scan = new Scanner(System.in);
    public void descontoIf(){
        System.out.println("Informe o preço do produto:");
        double precoProduto = scan.nextDouble();
        double desconto = 0.0;
        if (precoProduto>=100 && precoProduto<200){desconto = 5.0;}
        if (precoProduto>=200){desconto = 10.0;}
    //Calculo de Desconto
    double valorDesconto = precoProduto*desconto/100;
    double precoFinal = precoProduto-valorDesconto;
    System.out.println("O valor do produto com desconto é de R$" +precoFinal);
    }
}
