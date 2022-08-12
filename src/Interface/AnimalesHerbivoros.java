
package Interface;


public class AnimalesHerbivoros implements SeresVivos{

    @Override
    public String Nacen(String nombre) {
        return "Nace en una Zona de Selvaticas, y apartadas del ser Humano.";
    }

    @Override
    public String Crecer(String nombre) {
       return "Crece en espacios altos como Arboles.";
    }

    @Override
    public String Reproduce(String nombre) {
        return "Se Reproduce con Hendras de su misma Especie y su tiempo de gestacion es de 70 y 90 dias.";
    }

    @Override
    public String Comer(String comer) {
        return "Se Alimenta de Frutos y verduras";
    }
    
}
