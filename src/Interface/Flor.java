/*
 */
package Interface;


public class Flor implements SeresVivos{

    @Override
    public String Nacen(String nombre) {
        return "Una vez que un grano de polen cae sobre el estigma (abertura que tiene el pistilo),\n le crece un largo tubito que se juntará con el óvulo y dará lugar a una célula nueva llamada cigoto.\n Esta célula nueva será el origen de la nueva planta. Irá dividiéndose y creciendo.";
    }

    @Override
    public String Crecer(String nombre) {
        return " planta se arraiga y empieza a crecer, la plántula produce vástagos y yemas.\n Estos brotes, más tarde, se convierten en sus flores y los vástagos producen tallos y hojas. ...\n Esta es la etapa más interesante del proceso ya que se puede apreciar la belleza y elegancia de una flor en su máxima expresión.";
    }

    @Override
    public String Reproduce(String nombre) {
        return "La flor se reproducen formando semillas, operación en la que las flores juegan un papel muy importante.\n Se reproducen sexualmente, lo que significa que la parte masculina de la flor debe unirse con la parte femenina. ... \nEn primer lugar, los granos de polen tienen que llegar hasta el pistilo de otra flor.";
    }

    @Override
    public String Comer(String comer) {
        return "Mediante la fotosíntesis, las plantas son capaces de fabricar su propio alimento.\n Lo hacen a partir del agua y las sales minerales que consiguen del suelo,\n del dióxido de carbono del aire y de la luz del sol.";
    }
    
    
}
