
package agroalimentaria;

public class ProductosRefrigerados extends Productos {
    
private String CódigoOrganismoSupervisiónAlimentaria; 
            
public ProductosRefrigerados(String FechaCaducidad, String NúmeroLote){
        super(FechaCaducidad, NúmeroLote);
    }

public ProductosRefrigerados(String FechaCaducidad,String CódigoOrganismoSupervisiónAlimentaria, String NúmeroLote) {
    
    super(FechaCaducidad, NúmeroLote);
    this.CódigoOrganismoSupervisiónAlimentaria = CódigoOrganismoSupervisiónAlimentaria;
    }
 

public String getCódigoOrganismoSupervisiónAlimentaria() {
        return CódigoOrganismoSupervisiónAlimentaria;
    }
    
}
