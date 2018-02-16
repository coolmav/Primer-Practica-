
package agroalimentaria;


public class ProductosFrescos extends Productos {
    
private String FechaEnvasado; 
private String PaísOrigen;
            
 public ProductosFrescos(String FechaCaducidad, String NúmeroLote){
        super(FechaCaducidad, NúmeroLote);
    }

 public ProductosFrescos(String FechaCaducidad, String FechaEnvasado, String NúmeroLote, String PaísOrigen) {
    
    super(FechaCaducidad, NúmeroLote);
    this.FechaEnvasado = FechaEnvasado;
    this.PaísOrigen = PaísOrigen;
    }
 

    public String getFechaEnvasado() {
        return FechaEnvasado;
    }
    
    public String getPaísOrigen() {
        return PaísOrigen;
    }
}
