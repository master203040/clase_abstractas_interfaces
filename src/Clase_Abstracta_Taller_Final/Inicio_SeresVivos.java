
package Clase_Abstracta_Taller_Final;


public class Inicio_SeresVivos {
    
    public static void main(String[] args) {
        
        AnimalesCarnivoros  carnivoro = new AnimalesCarnivoros("Leon", "todo tipo de animales", 0.80, "4");
        
        AnimalesHerbivoros herbivoro = new AnimalesHerbivoros("Iguana", "se alimenta de frutas de los arboles", 0.25, "4");
        
        Flores flor = new Flores("girasol","amarillo","aceite de girasol","sol y agua", .60, "no tiene");
        
        Arboles arbol = new Arboles("cocotero","por medio de nutirentes del suelo", 29.9, "no tiene");
        
        Mujer mujer = new Mujer("si","de que alimenta de frutas y carne", 1.65, "4");
        
        Hombre hombre = new Hombre("de que se alimenta de frutas y carne", 1.70,"4");
        
        
        hombre.MostrarDatos();
        System.out.println(hombre.MostrarDatos());
        hombre.Nacen();
        hombre.Crecen();
        hombre.Reproducen();
        
        mujer.MostrarDatos();
        System.out.println(mujer.MostrarDatos());
        mujer.Nacen();
        mujer.Crecen();
        mujer.Reproducen();
        
        
        flor.MostrarDatos();
        System.out.println(flor.MostrarDatos());
        flor.Nacen();
        flor.Crecen();
        flor.Reproducen();
        
       
        arbol.MostrarDatos();
        System.out.println(arbol.MostrarDatos());
        arbol.Nacen();
        arbol.Crecen();
        arbol.Reproducen();
        
        
        carnivoro.MostrarDatos();
        System.out.println(carnivoro.MostrarDatos());
        carnivoro.Nacen();
        carnivoro.Crecen();
        carnivoro.Reproducen();
        
        
        herbivoro.MostrarDatos();
        System.out.println(herbivoro.MostrarDatos());
        herbivoro.Nacen();
        herbivoro.Crecen();
        herbivoro.Reproducen();
        
        
        
        
    }
}
