
package Clase_Abstracta_Taller_Final;


public abstract class SeresVivos {
     
    private String alimento;
    private double altura;
    private String extremidades;

    public SeresVivos(String alimento, double altura, String extremidades) {
        this.alimento = alimento;
        this.altura = altura;
        this.extremidades = extremidades;
    }

    public String getAlimento() {
        return alimento;
    }

    public double getAltura() {
        return altura;
    }

    public String getExtremidades() {
        return extremidades;
    }
    
    //metodo Abstractos
    public abstract void Nacen();
    public abstract void Crecen();
    public abstract void Reproducen();
    
    
    public String MostrarDatos(){
        
        return "";
    }
}

