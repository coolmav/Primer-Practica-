
package agroalimentaria;


public class ProductosCongelados extends Productos{
    
    private String TemperaturaCongelación; 
            
 public ProductosCongelados(String FechaCaducidad, String NúmeroLote){
        super(FechaCaducidad, NúmeroLote);
    }

 public ProductosCongelados(String FechaCaducidad,String TemperaturaCongelación, String NúmeroLote) {
    
    super(FechaCaducidad, NúmeroLote);
    this.TemperaturaCongelación = TemperaturaCongelación;
    }
 

    public String getTemperaturaCongelación() {
        return TemperaturaCongelación;
    } 
   
}
