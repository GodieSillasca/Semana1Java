public class Tienda{
	private String direccion;//dirección de la tienda
	private float dinero; //dinero con el que cuenta la sucursal
	static int contProductos=0; //productos
	static int contEmpleados=0; //empleados
	static int numeroTiendas=0; //tiendas

	public Tienda(String direccion,float dinero){
		this.direccion = direccion;
		this.dinero = dinero;
		numeroTiendas++;
	}

	public int numeroEmpleados(){
		
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public void setDinero(int dinero){
		this.dinero = dinero;
	}

	public int getDinero(){
		return dinero;
	}

	public void setProducto(String producto){
		this.producto = producto;
	}

	public String getProducto(){
		return producto;
	}

	public void setEmpleado(String empleado){
		this.empleado = empleado;
	}

	public String getEmpleado(){
		return empleado;
	}
}