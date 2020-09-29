package dominio;
public class OfertaOrdenador{

 private int precioInicial;
 private int descuento;
 private ModeloOrdenador tieneOrdenadorOfertado;


 public void setModelo(ModeloOrdenador modelo){
  tieneOrdenadorOfertado  = modelo;
 }

 public int calcularPrecioFinal(){
  return precioInicial - descuento;
 }

 public void setPrecioInicial(int nuevoPrecioInicial){
  precioInicial = nuevoPrecioInicial;
 }

 public void setDescuento(int nuevoDescuento){
  descuento = nuevoDescuento;
 }

 public String toString(){
  return "Oferta Ordenador: " + "\n -Precio inicial: "+ precioInicial + "€" + "\n -Descuento: " + descuento + "€" + "\nModelo del Ordenador: " + tieneOrdenadorOfertado + "\n -Precio final del ordenador: " + calcularPrecioFinal() + "€";
 }
}    