
package Clase_Abstracta_Taller_Final;


public abstract class Plantas extends SeresVivos{
    
    public Plantas(String alimento, double altura, String extremidades) {
        super(alimento, altura, extremidades);
    }
    
    @Override
    public abstract void Nacen();
    
    @Override
    public abstract  void Crecen();
    
    @Override
    public abstract  void Reproducen();
    
    
    
    
}
