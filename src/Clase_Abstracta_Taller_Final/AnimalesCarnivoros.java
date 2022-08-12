
package Clase_Abstracta_Taller_Final;



public class AnimalesCarnivoros extends Animales{

    public AnimalesCarnivoros(String animal, String alimento, double altura, String extremidades) {
        super(animal, alimento, altura, extremidades);
    }

    @Override
    public void Nacen() {
        System.out.println("Un animal Carnivoro Nace a partir de que salen del vientre materno");
    }

    @Override
    public void Crecen() {
        System.out.println("Un animal Carnivoro Crecen necesitan alimentarse para crecer y conseguir energía para \n" +
        "pasar distintas etapas del crecimiento.");
    }

    @Override
    public void Reproducen() {
        System.out.println("Un animal Carnivoro que se Reproduce");
    }
    
    @Override
    public String MostrarDatos(){
    
        return "\nNombre del Animal:"+getAnimal()+"\nSe Alimenta de :"+getAlimento()+
                "\nSu Altura es aproximadamente es de :"+getAltura()+"\nTiene cuantas patas:"+getExtremidades();
    }
}
