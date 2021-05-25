
package Main;

public class Instrumento {
    public Instrumento(String nom, int prec){
        nombre=nom;
        precio=prec;
    }
    private String nombre;
    private int precio;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
     public void mostrartodo(){
         System.out.println("el nombre es:" + getNombre()+ " "+ "\nel precio:"+ getPrecio() );
     }
}
