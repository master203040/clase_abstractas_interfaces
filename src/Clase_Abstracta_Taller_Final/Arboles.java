
package Clase_Abstracta_Taller_Final;


public class Arboles extends Plantas{
    private String tipo;
        

    public Arboles(String tipo, String alimento, double altura, String extremidades) {
        super(alimento, altura, extremidades);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
        
    @Override
    public void Nacen() {
        System.out.println("el Arbol Nacen por la Pepa de Mango:");
    }

    @Override
    public void Crecen() {
        System.out.println("El arbol crecen por medio de la mitosis");
    }

    @Override
    public void Reproducen() {
        System.out.println(" El Arbol se reproducen por medio de la fecundacion de la semilla:");
    }
    
    @Override
    public String MostrarDatos(){
        return "\nSe Alimenta: "+getAlimento()+"\ny su altura es: "+getAltura()+"\nes un Arbol: "+getTipo();
    }
    
}
