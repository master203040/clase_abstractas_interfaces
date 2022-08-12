
package Clase_Abstracta_Taller_Final;


public class Mujer extends Humanos{
    private String tienebebes;

    public Mujer(  String tienebebes,String alimento, double altura, String extremidades) {
        super(alimento, altura, extremidades);
        this.tienebebes = tienebebes;
    }
    
   
    public String getTienebebes() {
        return tienebebes;
    }
    
    @Override
    public void Nacen() {
        System.out.println("La Mujer despues de 42 semana de gestacion nace un bebe");
    }

    @Override
    public void Crecen() {
        System.out.println("la Mujer crece mediante la alimentacion y su desarrollo de su cuerpo");
    }

    @Override
    public void Reproducen() {
        System.out.println("la Mujer se reproduce durante el relacion sexo con un hombre");
    }
    
    
    @Override
    public String MostrarDatos(){
    
        return "\nTiene bebes la mujer?: "+getTienebebes()+"\nDe que se alimenta la mujer? :"+getAlimento()+"\nSu altura es?:"+getAltura()
                +"\nY tiene cuantas extremidades? :"+getExtremidades();
    }
    
}
