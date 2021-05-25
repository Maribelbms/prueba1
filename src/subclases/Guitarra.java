
package subclases;
import subclases.Cuerda;
public class Guitarra extends Cuerda {
    public Guitarra(String nombre,int precio,int cantidaddecuerda){
     super(nombre,precio,cantidaddecuerda);
}
public void afinar(){
 System.out.println("la guitarra se esta afinando");    
}    
public void accion(){
  System.out.println("la guitarra esta sonando");
}   
}
