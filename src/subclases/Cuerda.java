
package subclases;
import Main.Instrumento;
public class Cuerda extends Instrumento{
    private int cantidaddecuerda;
    public Cuerda(String nombre, int precio,int cantidaddecuerda) {
        super(nombre,precio);
        this.cantidaddecuerda=cantidaddecuerda;
    }  

    
    public int getCantidaddecuerda() {
        return cantidaddecuerda;
    }
    public void setCantidaddecuerda(int cantidaddecuerda) {
        this.cantidaddecuerda = cantidaddecuerda;
    }
     public void mostrar(){
         System.out.println("nombre" + getNombre());
         System.out.println("el precio es: " + getPrecio());
         System.out.println("la cantidad de cuerda es: " + getCantidaddecuerda());
     }
     public void tocar(){
         System.out.println(" el intrumento de cuerda esta tocando..."); 
     }
}
