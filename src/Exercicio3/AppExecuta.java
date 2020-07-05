package Exercicio3;

public class AppExecuta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppCelular celular = new AppCelular();
		
		celular.fazerligar(992001020);
		
		Contato contato = new Contato();
		contato.nome="Pedrão";
		contato.telefone = 999999999;
		
		celular.adicionarContato(contato);
	
		//nao era pra permitir
		//imprimir contato
		
		System.out.println("\n\n =====contato=====");
		for(Contato c : celular.contatos) {
			System.out.println("nome: "+c.nome);
			System.out.println("Numero: "+c.telefone);
			
		}
	}

}
