
package subclases;

import Main.Instrumento;
public class Percucion extends Instrumento {
     private String modelo;
      public Percucion(String nombre, int precio,String modelo) {
        super(nombre,precio);
        this.modelo=modelo;
    }  
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void mostrar(){
         System.out.println("nombre" + getNombre());
         System.out.println("el precio es: " + getPrecio());
         System.out.println("la cantidad de cuerda es: " + getModelo());
     }
     public void tocar(){
         System.out.println(" el intrumento de percucion esta tocando..."); 
     }
}
