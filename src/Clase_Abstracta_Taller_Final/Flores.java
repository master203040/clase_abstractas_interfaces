
package Clase_Abstracta_Taller_Final;
   
    
public class Flores extends Plantas{
    
    private String expecie;
    private String color;
    private String beneficios;

    public Flores( String expecie,String color, String beneficios, String alimento, double altura, String extremidades) {
        super(alimento, altura, extremidades);
        this.color = color;
        this.beneficios = beneficios;
        this.expecie = expecie;
    }

    public String getExpecie() {
        return expecie;
    }

       
    public String getColor() {
        return color;
    }

    public String getBeneficios() {
        return beneficios;
    }
    
    @Override
    public void Nacen() {
        System.out.println("La Flor Nace por Medio del Polen");
    }

    @Override
    public void Crecen() {
        System.out.println("Esta Flor Crece por Medio del Sol,Agua y los Nutrientes de la Tirrera ");
    }

    @Override
    public void Reproducen() {
        System.out.println("La Flor se RFeproduce por Medio del Polen que pasa de una Flor a otra");
    }
    
    @Override
    public String MostrarDatos(){
   
       return "\nSe Alimenta: " +getAlimento()+ "\nY su altura es: " +getAltura()+ "\nEs una flor: "+getExpecie()
       +"\nSu color es: "+getColor()+"\nEl beneficio es: "+getBeneficios();
                
    }

    
}
