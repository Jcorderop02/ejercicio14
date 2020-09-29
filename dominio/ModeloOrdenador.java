
package dominio;
public class ModeloOrdenador{
private String identificadorDeModelo;
private int memoriaRam;
private int discoDuro;
private String marca;
private String modeloDeProcesador;
private String tieneOrdenadorOfertado;

public void setModeloOrdenador(String nuevaMarca){
marca = nuevaMarca;
}

public String getIdentificadorDeModelo(){
return identificadorDeModelo;   
}

public int getMemoriaRam(){
return memoriaRam;
}

public String getMarca(){
return marca;
}

public String getModeloDeprocesador(){
return modeloDeProcesador;
}

public String getTieneOrdenadorOfertado(){
return tieneOrdenadorOfertado;
}

public String toString(){
return memoriaRam + "\nDiscoDuro" + discoDuro + marca + modeloDeProcesador;

}

}
