
package Clase_Abstracta_Taller_Final;



public class AnimalesHerbivoros extends Animales{

    public AnimalesHerbivoros(String animal, String alimento, double altura, String extremidades) {
        super(animal, alimento, altura, extremidades);
    }

    @Override
    public void Nacen() {
        System.out.println("Un Herdivoro Nace");
    }

    @Override
    public void Crecen() {
        System.out.println("Un Herdivoro Crecen");
    }

    @Override
    public void Reproducen() {
        System.out.println("Un Herdivoro se Reproducen");
    }
    
    @Override
    public String MostrarDatos(){
    
        return "\nNombre del Animal:"+getAnimal()+"\nSe Alimenta de :"+getAlimento()+
                "\nSu Altura es aproximadamente es de :"+getAltura()+"\nTiene cuantas patas:"+getExtremidades();
    }
    
}
