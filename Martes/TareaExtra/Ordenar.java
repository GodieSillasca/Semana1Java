import java.util.Scanner;

public class Ordenar{

	private String cadena="";
	private StringBuilder numeros = new StringBuilder();
	private StringBuilder letras = new StringBuilder();
	private int contadorNumeros=0;
	private int contadorLetras=0;

	public void pedirCadena(){

		Scanner entradaEscaner = new Scanner(System.in);
		System.out.println("Dame una cadena:");
		this.cadena = entradaEscaner.nextLine();
	}

	public void clasificarNumerosYLetras(){

		for (int n = 0;n<cadena.length();n++) {
			try
			{
				int c = Integer.parseInt(this.cadena.substring(n,n+1));
				numeros.append(c);
				contadorNumeros++;

			}
			catch(NumberFormatException excepcion)
			{
				letras.append(cadena.charAt(n));
				contadorLetras++;
			}
			
		}
		System.out.print("Hay ");
		System.out.print(contadorLetras);
		System.out.println(" letras en la cadena.");

		System.out.print("Hay ");
		System.out.print(contadorNumeros);
		System.out.println(" numeros en la cadena.");

	}

	public StringBuilder getLetras(){
		return letras;
	}

	public StringBuilder getNumeros(){
		return numeros;
	}

}