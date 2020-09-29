package dominio;
public class ModeloOrdenador{
    private int identificadorDeModelo;
    private int memoriaRam;
    private int discoDuro;
    private String marca;
    private String modeloDeProcesador;

    public void setIdentificadorDeModelo(int nuevoIdentificadorDeModelo){
        identificadorDeModelo = nuevoIdentificadorDeModelo;
    }

    public int getIdentificadorDeModelo(){
        return identificadorDeModelo;
    }

    public void setMemoriaRam(int nuevaMemoriaRam){
        memoriaRam = nuevaMemoriaRam;
    }

    public int getMemoriaRam(){
        return memoriaRam;
    }

    public void setDiscoDuro(int nuevoDiscoDuro){
        discoDuro = nuevoDiscoDuro;
    }

    public void setMarca(String nuevaMarca){
        marca = nuevaMarca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModeloDeProcesador(String nuevoModeloDeProcesador){
        modeloDeProcesador = nuevoModeloDeProcesador;
    }

    public String getModeloDeProcesador(){
        return modeloDeProcesador;
    }

    public String toString(){
        return "\nIdentificador de modelo: " + identificadorDeModelo + "\nMemoria ram: " + memoriaRam + "GB" + "\nTamaño del disco duro: " + discoDuro + "TB" + "\nMarca: " + marca + "\nModelo de procesador: " + modeloDeProcesador;

    }

}
