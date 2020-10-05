package aplicacion;
import dominio.*;
public class principal {
    public static void main(String[] args){

        ModeloOrdenador modeloOrdenador1 = new ModeloOrdenador();
        modeloOrdenador1.setIdentificadorDeModelo("GT76 Titan DT 10SGS 042ES");
        modeloOrdenador1.setMemoriaRam(16);
        modeloOrdenador1.setDiscoDuro(3);
        modeloOrdenador1.setMarca("MSI");
        modeloOrdenador1.setModeloDeProcesador("i9-10900K");

        OfertaOrdenador ofertaOrdenador1 = new OfertaOrdenador();
        ofertaOrdenador1.setPrecioInicial(3000);
        ofertaOrdenador1.setDescuento(500);
        ofertaOrdenador1.setModelo(modeloOrdenador1);

        System.out.println(ofertaOrdenador1);

        ModeloOrdenador modeloOrdenador2 = new ModeloOrdenador();
        modeloOrdenador2.setIdentificadorDeModelo("TITAN");
        modeloOrdenador2.setMemoriaRam(8);
        modeloOrdenador2.setDiscoDuro(1);
        modeloOrdenador2.setMarca("Asus");
        modeloOrdenador2.setModeloDeProcesador("i7-7700k");

        OfertaOrdenador ofertaOrdenador2 = new OfertaOrdenador();
        ofertaOrdenador2.setDescuento(300);
        ofertaOrdenador2.setPrecioInicial(4000);
        ofertaOrdenador2.setModelo(modeloOrdenador2);

        System.out.println(ofertaOrdenador2);
    }


}