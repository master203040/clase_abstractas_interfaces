
package Interface;


public class Arboles implements SeresVivos{
    
    
    
    @Override
    public String Nacen(String nombre) {
        return "Arbol de mango nace en climas tropicales. ...";
    }

    @Override
    public String Crecer(String nombre) {
        return "crecimiento del árbol da lugar a un proceso denominado secuestración de carbono o captura de carbono....";
    }

    @Override
    public String Reproduce(String nombre) {
        return "Un árbol de mango en pleno florecimiento es un verdadero espectáculo! Ciertos mangos en cada árbol recibirán más luz del sol que otros,\n y algunos permanecen en la sombra de la copa del árbol.";
    }

    @Override
    public String Comer(String comer) {
        return "El árbol absorbe CO², también conocido como bióxido de carbono,\n del medio ambiente, utilizándolo para formar el tronco,\n las ramas, las hojas, y la fruta del árbol de mango.";
    }
    
    public String Frutos(String frutos){
    
        return "Tiene forma ovalada, con la piel no comestible y color variable de amarillo pálido a rojo intenso.\n La pulpa es pegajosa y su coloración también varía, desde amarillo a anaranjado. El sabor del mango maduro es dulce,\n y bastante ácido cuando aún está verde. Es una fruta jugosa y fibrosa, y poseen un hueso interior. ";
    }

    
    
}
