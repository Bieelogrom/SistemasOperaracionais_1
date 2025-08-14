package controller;

public class OperacaoController {
	public OperacaoController() {
		super();
	}
	
	
	public void concatenaString() {
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for(int i = 0; i < 32768; i++) {
			cadeia = cadeia + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10,9);
		System.out.println("String: "+tempoTotal+"s.");
	}
	
	public void concatenaBuffer() {
		StringBuffer stringBuffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i = 0; i < 32768; i++) {
			stringBuffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10,9);
		System.out.println("Buffer: "+tempoTotal+"s.");
	}
	
	//Questão 1
	public void carregaVetor1000(int[] vetor) {
		double tempoInicial = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo após 1000 posições carregadas: "+tempoFinal+"s.");
	}
	
	public void carregaVetor10000(int[] vetor) {
		double tempoInicial = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo após 10000 posições carregadas: "+tempoFinal+"s.");
	}
	
	public void carregaVetor100000(int[] vetor) {
		double tempoInicial = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo após 100000 posições carregadas: "+tempoFinal+"s.");
	}
	
	public int recortaTexto(String texto) {
		String[] palavras = texto.split(";");
		return palavras.length;
	}
	
	public void verificaVetor(int[] vetor) {
		for(int numero : vetor) {
			if(numero % 2 == 0) {
				if(numero % 10 == 0) {
					System.out.println(numero+" é par e múltiplo de dez.");
				}
			}else{
				System.out.println(numero+" é impar.");
			}
		}
	}
}
