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
    }

}