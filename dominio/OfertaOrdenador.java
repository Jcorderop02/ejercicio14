package dominio;
public class OfertaOrdenador{
    
private int precioInicial;
private int descuento;  

public int calcularPrecioFinal(){
 return precioInicial - descuento;   
} 

public int getPrecioInicial(){
return precioInicial;
}

public int getDescuento(){
return descuento;
}

public void setOfertaOrdenador(int nuevoPrecioInicial){
precioInicial = nuevoPrecioInicial;
}    
  
}    