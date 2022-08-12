
package Interface;


public class Humano implements SeresVivos{

    @Override
    public String Nacen(String nombre) {
        return "nace a las 42 semana de getacion de una mujer";
    }

    @Override
    public String Crecer(String nombre) {
        return "para que tenga un buen crecimiento necesita una alimentacion para el desarrollo de el";
    }

    @Override
    public String Reproduce(String nombre) {
        return " se reproduce durante el relacion sexo con una mujer";
    }

    @Override
    public String Comer(String comer) {
        return " al igual que el resto de los seres vivos, necesitan,\n además del agua que es vital, una variada y equilibrada alimentación que es fundamental para la vida.\n Una dieta correcta debe contener cantidades adecuadas de proteínas, lípidos, glúcidos, vitaminas y minerales";
    }
    
}
