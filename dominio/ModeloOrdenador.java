package dominio;
public class ModeloOrdenador{
    private int memoriaRam;
    private int discoDuro;
    private String marca;
    private String modeloDeProcesador;
    private String identificadorDeModelo;

    public void setIdentificadorDeModelo(String nuevoIdentificadorDeModelo){
        identificadorDeModelo = nuevoIdentificadorDeModelo;
    }

    public void setMemoriaRam(int nuevaMemoriaRam){
        memoriaRam = nuevaMemoriaRam;
    }

    public void setDiscoDuro(int nuevoDiscoDuro){
        discoDuro = nuevoDiscoDuro;
    }

    public void setMarca(String nuevaMarca){
        marca = nuevaMarca;
    }

    public void setModeloDeProcesador(String nuevoModeloDeProcesador){
        modeloDeProcesador = nuevoModeloDeProcesador;
    }

    public String toString(){
        return "\n -Identificador de modelo: " + identificadorDeModelo + "\n -Memoria ram: " + memoriaRam + "GB DDR4 (2666MHz)" + "\n -Tamaño del disco duro: " + discoDuro + "TB NVMe PCIe Gen3x4 SSD" + "\n -Marca: " + marca + "\n -Modelo de procesador: " + modeloDeProcesador;

    }

}
