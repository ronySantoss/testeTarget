package application;

public class Program {

	public static void main(String[] args) {

		System.out.println(inverterCaracteres("Target"));
	}

	public static String inverterCaracteres(String s) {
		
		int i;
		int n;
		String aux;
		aux = "";
		
		n = s.length();
		for(i=(n-1); i>=0; i--) {
			aux = aux + s.charAt(i);
		}
		
		return aux;
	}
}
