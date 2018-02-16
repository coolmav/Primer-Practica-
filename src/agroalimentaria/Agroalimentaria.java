
package agroalimentaria;


public class Agroalimentaria {

    public static void main(String[] args) {

       /*ProductosFrescos*/
       ProductosFrescos proF=new ProductosFrescos("25/04/2020", "H203152", "25/04/2018", "H.T");
       
       /*ProductosRefrigerados*/
       ProductosRefrigerados proR=new ProductosRefrigerados ("02/06/2020", "C201569", "CU00687B");
       
       /*ProductosCongelados*/
       ProductosCongelados proC=new ProductosCongelados ("10/01/2020", "X562148", "10ºC");
    

        /*ProductosFrescos*/
        System.out.println(proF.getFechaCaducidad());
        System.out.println(proF.getFechaEnvasado());
        System.out.println(proF.getNúmeroLote());
        System.out.println(proF.getPaísOrigen());
        
        /*ProductosRefrigerados*/
        System.out.println(proR.getFechaCaducidad());
        System.out.println(proR.getNúmeroLote());
        System.out.println(proR.getCódigoOrganismoSupervisiónAlimentaria());
    
        /*ProductosCongelados*/
        System.out.println(proC.getFechaCaducidad());
        System.out.println(proC.getNúmeroLote());
        System.out.println(proC.getTemperaturaCongelación());
    
    }
    
}
