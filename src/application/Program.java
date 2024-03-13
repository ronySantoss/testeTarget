package application;

public class Program {

	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		int aux;
		int chosenNumber = 144;
		
		for(int i = 0; i<30; i++) {
			System.out.println(a);
			if(a == chosenNumber) {
				System.out.println("Número " + chosenNumber + " detectado!");
			}
			aux = a;
			a= a+b;
			b = aux;
		}
	}

}
