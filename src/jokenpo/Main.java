package jokenpo;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
	int papel = 0;
	int tesoura = 1;
	int pedra = 2;
	int opcao;
	int opcaopc;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("--------------------------------");
	System.out.println("       JOKENPO                   ");
	System.out.println("---------------------------------");
	System.out.println("Escolha um numero: ");
	System.out.println(" PAPEL = 0");
	System.out.println(" TESOURA = 1");
	System.out.println(" PEDRA = 2");

	System.out.print("Qual sua opção? ");
    opcao = sc.nextInt();
	
	if (opcao == papel && opcao != tesoura && opcao != pedra) {
		System.out.printf("Sua opçao foi: (0) PAPEL ", opcao);
		System.out.println();
	} else if (opcao == tesoura && opcao != papel && opcao != pedra) {
		System.out.printf("Sua opçao foi: (1) TESOURA ", opcao);
		System.out.println();
    } else if (opcao == pedra && opcao != papel && opcao != tesoura) {
		System.out.printf("Sua opçao foi: (2) PEDRA ", opcao);
		System.out.println();
    }
	
	opcaopc = new Random().nextInt(2);
	System.out.printf("A opçao da maquina foi: ");
	System.out.println(opcaopc);
	
	if (opcaopc == papel && opcao == tesoura) {
		System.out.println("VOCE GANHOU!! TESOURA CORTA PAPEL!!! PARABENS");
	} else if (opcaopc == papel && opcao == papel) {
		System.out.println("EMPATE!!!");
	} else if (opcaopc == papel && opcao == pedra) {
		System.out.println("VOCE PERDEU!! PAPEL EMBRULHA PEDRA!!!");
		
	} else if (opcaopc == pedra && opcao == tesoura) {
		System.out.println("VOCE PERDEU!! PEDRA QUEBRA TESOURA!!!");	
	} else if(opcaopc == pedra && opcao == papel) {
		System.out.println("!VOCE GANHOU!! PAPEL EMBRULHA PEDRA!!!");
	} else if(opcaopc == pedra && opcao == pedra) {
		System.out.println("EMPATE!!!");
	}
	
	else if (opcaopc == tesoura && opcao == pedra) {
		System.out.println("VOCE GANHOU!! PEDRA QUEBRA TESOURA!!! PARABENS");
	} else if(opcaopc == tesoura && opcao == papel) {
		System.out.println("VOCE PERDEU!! TESOURA CORTA PAPEL!!!");
	} else if(opcaopc == tesoura && opcao == tesoura) {
		System.out.println("EMPATE!!!");
	}
	sc.close();
	
	    }
	}