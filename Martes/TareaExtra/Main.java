public class Main{
	public static void main(String[] args) {
		Ordenar cadenaAOrdenar = new Ordenar();
		cadenaAOrdenar.pedirCadena();
		cadenaAOrdenar.clasificarNumerosYLetras();

		System.out.println("La cadena ordenada es:");

		System.out.print(cadenaAOrdenar.getNumeros());
		System.out.println(cadenaAOrdenar.getLetras());
	}
}