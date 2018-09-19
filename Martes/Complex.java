import java.util.Scanner;

public class ClaseCompleja
{
  private double real;
  private double imaginario;

  public ClaseCompleja(){} //Declaración explicita del contructor ClaseCompleja

  public ClaseCompleja(double real, double imaginario){ //Declara método contructor
     this.real=real;
     this.imaginario=imaginario;
  }

  public double modulo(){
    return Math.sqrt(real*real+imaginario*imaginario);
  }

  public static ClaseCompleja sumar(ClaseCompleja a, ClaseCompleja b){
    ClaseCompleja suma = new ClaseCompleja();
    suma.real = a.real + b.real;
    suma.imaginario = a.imaginario + b.imaginario;
    return suma;
  }
  public static ClaseCompleja restar(ClaseCompleja a, ClaseCompleja b){
    ClaseCompleja resta = new ClaseCompleja();
    resta.real = a.real - b.real;
    resta.imaginario = a.imaginario - b.imaginario;
    return resta;
  }
  public static ClaseCompleja multiplicar(ClaseCompleja a, ClaseCompleja b){
    ClaseCompleja multiplicacion = new ClaseCompleja();
    multiplicacion.real =a.real*b.real-a.imaginario*b.imaginario;
    multiplicacion.imaginario = a.real*b.imaginario+a.imaginario*b.real;
    return multiplicacion;
  }
  public static ClaseCompleja dividir(ClaseCompleja a, ClaseCompleja b){
    ClaseCompleja division = new ClaseCompleja();
    double aux;
     if(b.modulo()==0.0)
     {
          System.out.println("Division entre cero no existe");
     }
     else
     {
          aux=b.real*b.real+b.imaginario*b.imaginario;
          division.real=(a.real*b.real+a.imaginario*b.imaginario)/aux;
          division.imaginario=(a.imaginario*b.real-a.real*b.imaginario)/aux;
     }
    return division;
  }
 
  public static double ang(ClaseCompleja a)
  {
    double angulo = Math.atan2(a.imaginario,a.real);  
    if(angulo<0){   
      angulo=2*Math.PI+angulo;
      }
      angulo=angulo*180/Math.PI;

  return angulo;
  }
  
  public static double magnitud(ClaseCompleja a)
  {
    double mag=Math.sqrt(Math.pow(a.real,2)+Math.pow(a.imaginario,2));
    return mag;
  }

  
  public static void main(String[] args) 
  {
    double unor,dosr,unoi,dosi;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Dame la parte real del primer elemento");
    unor = entrada.nextDouble();
 
    System.out.println("Dame la parte imaginarioinaria del primer elemento");
    dosr = entrada.nextDouble();

    System.out.println("Dame la parte real del segundo elemento");
    unoi = entrada.nextDouble();
 
    System.out.println("Dame la parte imaginarioinaria del segundo elemento");
    dosi = entrada.nextDouble();

    ClaseCompleja uno = new ClaseCompleja(unor,dosr);
    ClaseCompleja dos = new ClaseCompleja(unoi,dosi);
    ClaseCompleja ax = new ClaseCompleja();
    
    System.out.println("Numero uno:" + uno);
    System.out.println("Numero dos:" + dos);
    ax=ClaseCompleja.sumar(uno,dos);
    System.out.println("La suma es " +ax.real + " + " + ax.imaginario+"i");
    ax = ClaseCompleja.restar(uno,dos);
    System.out.println("La resta es " + ax.real  + ax.imaginario+"i");
    ax = ClaseCompleja.multiplicar(uno,dos);
    System.out.println("La multiplicacion es " + ax.real + " + " + ax.imaginario+"i");
    ax = ClaseCompleja.dividir(uno,dos);
    System.out.println("La division es " + ax.real + " + " + ax.imaginario+"i");
    System.out.println("El angulo de 1+3i es: "+ClaseCompleja.ang(uno)+"°");
    System.out.println("El angulo de 5+8i es: "+ClaseCompleja.ang(dos)+"°");
    System.out.println("La magnitud del numero uno es: "+(int)ClaseCompleja.magnitud(uno));
    System.out.println("La magnitud del numero dos es: "+(int)ClaseCompleja.magnitud(dos));
    }
}
