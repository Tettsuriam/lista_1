package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class AppCelular {
	
	int memoria;
	String modelo;
	List<Contato>contatos;
	//construtor
	
	AppCelular(){
		contatos = new ArrayList<Contato>();
	}
	//operações
	
	void fazerligar(int num) {
		System.out.println("lingando para "+num);
	}
	
	void receberligar(int num) {
		System.out.println("recebendo ligação de"+ num);
	}
	
	//manter contato
	//adicionar um contato
	//remove
	//alterar
	//buscar
   
	
	void adicionarContato(Contato contato) {
		contatos.add(contato);
		System.out.println("novo contato");
	}
	
	void RemoverContato(Contato contato) {
		contatos.remove(contato);
	}
	
	void AlterarContato(Contato contato) {
		
	}
	
	Contato buscarContato(String nome) {
		Contato c = null;
		
		for(Contato contato : contatos) {
			if(contato.nome==nome) {
				c = contato;
			}
		}
		return c;
		
	}
	void TocarMusica() {
		System.out.println("Tocar musica");
	}

}




