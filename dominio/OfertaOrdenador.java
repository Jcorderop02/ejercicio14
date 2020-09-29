package dominio;
public class OfertaOrdenador{

 private int precioInicial;
 private int descuento;
 private ModeloOrdenador modeloDeProcesador;


 public void setModelo(ModeloOrdenador modelo){
  modeloDeProcesador = modelo;
 }

 public int calcularPrecioFinal(){
  return precioInicial - descuento;
 }

 public void setPrecioInicial(int nuevoPrecioInicial){
  precioInicial = nuevoPrecioInicial;
 }

 public int getPrecioInicial(){
  return precioInicial;
 }

 public void setDescuento(int nuevoDescuento){
  descuento = nuevoDescuento;
 }

 public int getDescuento(){
  return descuento;
 }

 public void setOfertaOrdenador(int nuevoPrecioInicial){
  precioInicial = nuevoPrecioInicial;
 }

 public String toString(){
  return "OfertaOrdenador: " + "\nPrecio inicial: "+ precioInicial + "\nDescuento: " + descuento + "\nModeloOrdenador" + modeloDeProcesador;
 }
}    