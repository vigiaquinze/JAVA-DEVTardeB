package Java.ExercicioOperadores;

import java.util.Scanner;

public class Exercicio {
    Scanner scan = new Scanner(System.in);
    public void calcular() {
        System.out.println("Para o aluno ser aprovado, ele precisa ter média das notas igual ou maior que 50 e frequência maior que 75%");
        System.out.println("Insira a primeira nota:");
        int notaUm = scan.nextInt();
        System.out.println("Insira a segunda nota");
        int notaDois = scan.nextInt();
        //Operação Aritmética
        double mediaAluno = (notaUm+notaDois)/2;
        System.out.println("A média do aluno é" +mediaAluno);
        boolean mediaAprovada = mediaAluno>=50;
        System.out.println("O aluno está aprovado por nota?" +mediaAprovada);
        System.out.println("Insira a porcentagem de frequência do aluno:");
        int porcentagemFrequencia = scan.nextInt();
        boolean frequenciaAprovada = porcentagemFrequencia>=75;
        //Operação Lógica
        boolean resultadoFinal = (mediaAprovada=true) && (frequenciaAprovada=true);
    }
}
