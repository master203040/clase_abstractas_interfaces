
package Clase_Abstracta_Taller_Final;


public class Hombre extends Humanos{

    public Hombre(String alimento, double altura, String extremidades) {
        super(alimento, altura, extremidades);
    }

    @Override
    public void Nacen() {
        System.out.println("un hombre nace a las 42 semana de getacion de una mujer ");
    }

    @Override
    public void Crecen() {
        System.out.println("el hombre para que tenga un buen crecimiento necesita una alimentacion para el desarrollo de el");
    }

    @Override
    public void Reproducen() {
        System.out.println("el hombre se reproduce durante el relacion sexo con una mujer");
    }
    
    public String MostrarDatos(){
    
        return "\nDe que se alimenta la hombre? :"+getAlimento()+"\nSu altura es?:"+getAltura()
                +"\nY tiene cuantas extremidades? :"+getExtremidades();
    }
}
