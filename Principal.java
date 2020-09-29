import dominio.*;

public class Principal {

OfertaOrdenador ofO;
ModeloOrdenador moO;

public static void inicio(){
    
ModeloOrdenador modeloOrdenador1 = new ModeloOrdenador();
modeloOrdenador1.MemoriaRam = 16;
modeloOrdenador1.discoDuro = 3;
modeloOrdenador1.marca = "Asus";
modeloOrdenador1.modeloDeProcesador = "Ryzen 9 3900x"; 

OfertaOrdenador ofertaOrdenador1 = new OfertaOrdenador();
ofertaOrdenador1.getPrecioInicial = 3000;
ofertaOrdenador1.Getdescuento = 500;

System.out.println(modeloOrdenador1);
}

}