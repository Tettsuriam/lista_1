package exercicio_1;

public class ArCondicionado {
	String modelo;
	String fabricante;
	int potencia;
	boolean ligado;
	Modos ModoAtual;
	
	//metodo construtor
	ArCondicionado(){
		ligado = false;
		modelo = null;
		potencia = 0;
		fabricante = null;
	}
	
	void swing() {
		//swing mode
		
	}
	void fan() {
		//ventilador
		
	}
	void liga() {
		//ligar
		ligado = !ligado;
		System.out.println(ligado);

	}
	void mudaTemperatura() {
		//muda temperatura
	}
	void modo() {
		//modos de operação
		ModoAtual = Modos.REFRIGERACAO;
		
	}
}
