package view;

import java.util.Scanner;

import controller.OperacaoController;

public class Main {
	public static void main(String[] args) {
		OperacaoController operacaoController = new OperacaoController();
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Teste
		operacaoController.concatenaBuffer();
		operacaoController.concatenaString();
		*/
		int[] vetor1 = new int[1000];
		int[] vetor2 = new int[10000];
		int[] vetor3 = new int[100000];
		
		operacaoController.carregaVetor1000(vetor1);
		operacaoController.carregaVetor10000(vetor2);
		operacaoController.carregaVetor100000(vetor3);
		
		String texto1 = "abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba";
		String texto2 = "abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga";
		String texto3 = "acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião";
		
		System.out.println("Palavras no texto 1: "+operacaoController.recortaTexto(texto1));
		System.out.println("Palavras no texto 2: "+operacaoController.recortaTexto(texto2));
		System.out.println("Palavras no texto 3: "+operacaoController.recortaTexto(texto3));
		
		
		int valor;
		System.out.println("Digite o tamanho do array: ");
		
		do {
			valor = sc.nextInt();
			if(valor > 100) {
				System.out.println("Valores limitados a 100!");
			}
		}while(valor > 100);
		
		int[] vetor = new int[valor];
		int tamanho = vetor.length;
		
		for(int i = 0; i < tamanho; i++) {
			System.out.print("Digite valor de "+i+": ");
			vetor[i] = sc.nextInt();
		}
		
		operacaoController.verificaVetor(vetor);
	}
}
