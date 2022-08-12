
package Clase_Abstracta_Taller_Final;


public abstract class Animales extends SeresVivos{
    
    private String animal;

    public Animales(String animal, String alimento, double altura, String extremidades) {
        super(alimento, altura, extremidades);
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    @Override
    public abstract void Nacen();
    @Override
    public abstract void Crecen();
    @Override
    public abstract void Reproducen();
    
}
