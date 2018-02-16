
package agroalimentaria;


public class Productos {
    
    private String FechaCaducidad ;
    private String NúmeroLote;
    
    
    
    //Creacion de constructor por defecto
    
public Productos(){
        
    }
    
    //Constructor con dos parametros

    public Productos(String FechaCaducidad, String NúmeroLote) {
        this.FechaCaducidad = FechaCaducidad;
        this.NúmeroLote = NúmeroLote;
    }

    
    
/*Metodos de Set*/    
    public void setFechaCaducidad(String FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    public void setNúmeroLote(String NúmeroLote) {
        this.NúmeroLote = NúmeroLote;
    }

    
    
/*Metodos de Get*/ 
    public String getFechaCaducidad() {
        return FechaCaducidad;
    }

    public String getNúmeroLote() {
        return NúmeroLote;
    }

  
 
}
