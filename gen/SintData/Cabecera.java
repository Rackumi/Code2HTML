package SintData;

import java.util.LinkedList;

public class Cabecera {
    public String metodo;
    public String tipo;
    public String nombre;
    public LinkedList<String> tiposParam;
    public LinkedList<String> params;

    public Cabecera(String metodo, String tipo, String nombre, LinkedList<String> tiposParam, LinkedList<String> params){
        this.metodo = metodo;
        this.tipo = tipo;
        this.nombre = nombre;
        this.tiposParam = tiposParam;
        this.params = params;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getTiposParam() {
        return tiposParam;
    }

    public void setTiposParam(LinkedList<String> tiposParam) {
        this.tiposParam = tiposParam;
    }

    public LinkedList<String> getParams() {
        return params;
    }

    public void setParams(LinkedList<String> params) {
        this.params = params;
    }

    @Override
    public String toString(){
        return "Cabecera: "+getMetodo()+" "+getTipo()+" "+getNombre()+" "+getTiposParam()+" "+getParams();
    }
}
