
package Interface;

import java.util.Scanner;


public class InicioSeresVivos {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        AnimalesCarnivoros objcarnivoros = new AnimalesCarnivoros();
        AnimalesHerbivoros objherbivoros = new AnimalesHerbivoros();
        Arboles objarbol = new Arboles();
        Flor objflor = new Flor();
        Humano objhombre = new Humano();
        
       
        String n;//variable llamada
        
        System.out.println("Digita el Nombre del Animal carnivoro");
        n=leer.next();
        System.out.println("desea saber donde nace el leon "+objcarnivoros.Nacen(n));
        System.out.println("");
        
        System.out.println("deseas saber donde crece el leon?");
        n=leer.next();
        System.out.println("Este "+objcarnivoros.Crecer(n));
        System.out.println("");
        
        System.out.println("deseas saber como se reproduce el leon?");
        n=leer.next();
        System.out.println("Este "+objcarnivoros.Reproduce(n));
        System.out.println("");
        
        System.out.println("deseas saber de que Alimenta el leon?");
        n=leer.next();
        System.out.println("Este "+objcarnivoros.Comer(n));
        System.out.println("");
        
        System.out.println("digite el nobre de la planta");
        n=leer.next();
        System.out.println("Este"+objarbol.Nacen(n));
        System.out.println("");
        
        System.out.println("desea saber como crece un arbol de mangos");
        n = leer.next();
        System.out.println("El"+ objarbol.Crecer(n));
        System.out.println("");
        
        System.out.println("desea saber como se proproducen un arbol de mangos");
        n=leer.next();
        System.out.println("como se reproduce"+objarbol.Reproduce(n));
        System.out.println("");
        
        System.out.println("desea saber de que se alimenta un arbol de mangos");
        n=leer.next();
        System.out.println("se alimenta"+objarbol.Comer(n));
        System.out.println("");
        
        System.out.println("desea saber como es un fruto del arbol de mangos");
        n=leer.next();
        System.out.println("su fruto"+objarbol.Frutos(n));
        System.out.println("");
        
        System.out.println("Digite el nombre de la Flor");
        n=leer.next();
        System.out.println("la flor es"+objflor.Nacen(n));
        System.out.println("");
        
        System.out.println("quiere saber como crece una Flor");
        n=leer.next();
        System.out.println("una ves la"+objflor.Crecer(n));
        System.out.println("");
        
        System.out.println("quiere saber como se reproduce una Flor");
        n=leer.next();
        System.out.println("una ves  "+objflor.Reproduce(n));
        System.out.println("");
        
        System.out.println("quiere saber como se alimenta una Flor");
        n=leer.next();
        System.out.println("esta se "+objflor.Comer(n));
        System.out.println("");
        
        System.out.println("Dite el nombre de este ser humano");
        n=leer.next();
        System.out.println("el hombre "+objhombre.Nacen(n));
        System.out.println("");
        
        System.out.println("desea saber como crece un ser humano");
        n=leer.next();
        System.out.println("el hombre "+objhombre.Crecer(n));
        System.out.println("");
        
        System.out.println("desea saber de que se alimenta un ser humano");
        n=leer.next();
        System.out.println("los seres humanos"+objhombre.Reproduce(n));
        System.out.println("");
        System.out.println("");
        System.out.println("este taller fue realizado por los estudiantes\nCARLOS ORTEGA\nALEXANDER GOMEZ\nJUAN PABLO GARCIA");
        
    }
    
}
