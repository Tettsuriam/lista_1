package exercicio_1;

public class appteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArCondicionado ar = new ArCondicionado();
		
		System.out.println("Ar: "+ ar);
		
		System.out.println("Fabricante: "+ar.fabricante);
		
		ar.fabricante= "gree";
		
		System.out.println("Fabricante: "+ar.fabricante);
		
		ar.liga();
		ar.liga();
		}

}
