
package subclases;
import subclases.Viento;
public class Clarinete extends Viento{
    public Clarinete(String nombre,int precio,String modelo){
     super(nombre,precio,modelo);
}
   
public void accion(){
  System.out.println("el clarinete esta sonando");
}   
}  
