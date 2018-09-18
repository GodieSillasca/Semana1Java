public class Main{
	public static void main(String[] args) {
		
		//Para la Sucursal 1
		Tienda sucursal1 = new Tienda("Enrique Segoviano #8",20000);
		//Para sus empleados
		Empleado empleado1 = new Empleado("gerente","Juan",200);
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
		System.out.print("Posee ");
		System.out.print(sucursal1.getEmpleado());
		System.out.println(" empleados, que son:");
		System.out.print(empleado1.getNombre());
		System.out.print(", ");
		System.out.println(empleado1.getPuesto());
		System.out.print(empleado2.getNombre());
		System.out.print(", ");
		System.out.println(empleado2.getPuesto());
		System.out.print(empleado3.getNombre());
		System.out.print(", ");
		System.out.println(empleado3.getPuesto());
		System.out.print(empleado4.getNombre());
		System.out.print(", ");
		System.out.println(empleado4.getPuesto());
		System.out.println("Tienen salarios de:");
		System.out.print(empleado1.getSueldo());
		System.out.println("pesos");
		System.out.print(empleado2.getSueldo());
		System.out.println("pesos");
		System.out.print(empleado3.getSueldo());
		System.out.println("pesos");		
		System.out.print(empleado4.getSueldo());
		System.out.println("pesos");
	}
}