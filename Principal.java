import dominio.*;
public class Principal {
    public static void inicio(){

        ModeloOrdenador modeloOrdenador1 = new ModeloOrdenador();
        modeloOrdenador1.setIdentificadorDeModelo(6327462);
        modeloOrdenador1.setMemoriaRam(16);
        modeloOrdenador1.setDiscoDuro(3);
        modeloOrdenador1.setMarca("Asus");
        modeloOrdenador1.setModeloDeProcesador("Ryzen 9 3900x");

        OfertaOrdenador ofertaOrdenador1 = new OfertaOrdenador();
        ofertaOrdenador1.setPrecioInicial(3000);
        ofertaOrdenador1.setDescuento(500);
        ofertaOrdenador1.setModelo(modeloOrdenador1);

        System.out.println(ofertaOrdenador1);
    }

}