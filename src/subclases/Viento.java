
package subclases;
import Main.Instrumento;
public class Viento extends Instrumento {
    private String tamaño;
    public Viento(String nombre, int precio,String tamaño) {
        super(nombre,precio);
        this.tamaño=tamaño;
    }  

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
