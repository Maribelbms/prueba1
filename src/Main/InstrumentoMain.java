
package Main;
import Main.Instrumento;
import subclases.Clarinete;
import subclases.Guitarra;
import subclases.Tambor;
import subclases.Saxofon;

public class InstrumentoMain {
    public static void main(String[] args){
        System.out.println("INSTRUMENTO DE VIENTO");
      Clarinete instrumento= new Clarinete("clarinete",123,"45R");
      instrumento.mostrartodo();
      instrumento.accion();
      System.out.println("INTRUMENTO DE CUERDA");
      Guitarra instrument=new Guitarra("guitarra clasica",54300,5);
       instrument.accion();
       instrument.afinar();
       instrument.mostrartodo();
       System.out.println("INSTRUMENTO DE PERCUCION");
       Tambor instrumen= new Tambor("tambor",4321,"mediano");
      instrumen.mostrartodo();
      instrumento.accion();
      System.out.println("INSTRUMENTO DE VIENTO");
      Saxofon instrume= new Saxofon("Saxofon",5000,"ABC");
      instrumento.mostrartodo();
      instrumento.accion();
    }
            
}
