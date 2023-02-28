package Java.ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner scan = new Scanner(System.in);

    public void exerc1 () {
        System.out.println("1 = Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.");
        System.out.println("Insira o primeiro valor");
        int primeiroValor = scan.nextInt();
        System.out.println("Insira o segundo valor");
        int segundoValor = scan.nextInt();
        int valorMaior=0;
        if (primeiroValor>=segundoValor){valorMaior=primeiroValor;}
        if (segundoValor>=primeiroValor){valorMaior=segundoValor;}
        System.out.println("O maior valor é:"+valorMaior);
    }

    public void exerc2() {
        System.out.println("2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessárioconsiderar o mês em que ela nasceu).");
        int anoNascimento = scan.nextInt();
        boolean incapazVotar = anoNascimento>=2008;
        boolean capazVotar = anoNascimento<=2007;
        if (incapazVotar=true);{"Você não pode votar."};
        if (capazVotar=true);{"Você pode votar"};
    }

    public void exerc3() {

    }

    public void exerc4() {

    }

    public void exerc5() {

    }

    public void exerc6() {

    }
}
