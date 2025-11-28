package ofertastienda;

//Atributos. Paso 1
public class OfertasDescuentos {
    private double docenas;
    private double precioDocenas;

//Metodo constructor. Paso 2    
    public OfertasDescuentos() {
        docenas = precioDocenas = 1;
    }
    
    public OfertasDescuentos(double d, double pD){
        this.docenas = d;
        this.precioDocenas = pD;
    }
    
    //Metodo analizador. Paso 3 
    public double getMontoCompra(){
        return docenas * precioDocenas;
    }
    
    public double getMontoDescuento(){
        if(docenas > 3){
           return getMontoCompra() * 0.15;
        } else {
            return getMontoCompra() * 0.10;
        }
    }
    
    public double getMontoPagar(){
        return getMontoCompra() - getMontoDescuento();
    }
    
    //Paso 4
    public double getNumeroObsequios(){
        if (docenas > 3){
            double obsequio = docenas - 3;
            return obsequio * 12;
        } else {
            return 0;
        }
    }
    
    //Setters. Paso 5
    public void setDocenas(double docena){
        this.docenas = docena;
    }
    
    public void setPrecioDocenas(double precioDocenas){
        this.precioDocenas = precioDocenas;
    }
    
    
}