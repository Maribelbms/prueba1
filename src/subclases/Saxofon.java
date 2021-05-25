
package subclases;
import subclases.Viento;
public class Saxofon extends Viento {
    public Saxofon(String nombre,int precio,String tamaño){
     super(nombre,precio,tamaño);
}
public void afinar(){
  System.out.println("el saxofon se esta afinando");   
}    
public void accion(){
  System.out.println("el saxofon esta dando melodia");
}   
} 

