
package subclases;
import subclases.Percucion;
public class Tambor extends Percucion {
    public Tambor(String nombre,int precio,String tamaño){
     super(nombre,precio,tamaño);
}
   
public void accion(){
    System.out.println("el tambor esta sonando");
}   
} 

