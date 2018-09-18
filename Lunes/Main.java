public class Main{
	public static void main(String[] args) {
		
		//Para la Sucursal 1
		Tienda sucursal1 = new Tienda("Enrique Segoviano #8",20000);
		//Para sus empleados
		Empleado empleado1 = new Empleado("gerente","Juan",200)
		Empleado empleado2 = new Empleado("cajero","Toño",100);
		Empleado empleado3 = new Empleado("conserje","Mateo",75);
		Empleado empleado4 = new Empleado("vigilante","Pedro",75);
		//Para sus productos
		Producto producto1 = new Producto(10,"nito"); 
		Producto producto2 = new Producto(5,"polvoron"); 
		Producto producto3 = new Producto(50,"recarga de saldo"); 
		Producto producto4 = new Producto(20,"coca-cola"); 
		//Presentación de datos
		System.out.print("La sucursal 1 está ubicada en: ");
		System.out.println(sucursal1.getDireccion());
	}
}